package top.zjp.medicine.online.datav.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.zjp.medicine.online.datav.model.dto.ExamDetailDto;

import java.util.List;

/**
 * @Author: krislorem
 * @Package: top.zjp.medicine.online.datav.mapper
 * @Project: medicine-online-data-view-screen0
 * @name: ExamMapper
 * @Date: 2024/12/12 16:35
 * @FileName: ExamMapper
 * @description: 多表联查结果
 */
@Mapper
public interface ExamMapper extends BaseMapper<ExamDetailDto> {

    @Select("""
                SELECT
            	e.title AS name,
            	ex.title AS paper,
            	e.end_time AS end,
            	e.is_start AS start,
            	s.NAME AS student,
            	c_parent.NAME AS city,
            	ex.simple_score AS sin,
            	ex.multiple_score AS mul,
            	ex.blank_score AS blank,
            	COUNT( DISTINCT CASE WHEN qb.option_type = 0 THEN qb.pk_id END ) AS sin_n,
            	COUNT( DISTINCT CASE WHEN qb.option_type = 1 THEN qb.pk_id END ) AS mul_n,
            	COUNT( DISTINCT CASE WHEN qb.option_type = 2 THEN qb.pk_id END ) AS blank_n,
            	COUNT( DISTINCT CASE WHEN qb.option_type IN ( 0, 1, 2 ) THEN qb.pk_id END ) AS total_n,
            	(
            		COUNT( DISTINCT CASE WHEN qb.option_type = 0 THEN qb.pk_id END ) * ex.simple_score + COUNT( DISTINCT CASE WHEN qb.option_type = 1 THEN qb.pk_id END ) * ex.multiple_score + COUNT( DISTINCT CASE WHEN qb.option_type = 2 THEN qb.pk_id END ) * ex.blank_score
            	) AS total_s,
            	sg.grade AS grade,
            	  COALESCE(se.is_finish, 0) AS finish -- 使用COALESCE函数处理null值
            FROM
            	t_quiz_item_exam e
            	INNER JOIN t_quiz_paper ex ON e.pk_id = ex.quiz_exam_id
            	INNER JOIN t_quiz_item_grade sg ON e.pk_id = sg.quiz_detail_id
            	INNER JOIN t_student s ON sg.student_id = s.pk_id
            	INNER JOIN t_city_code c ON s.city_code = c.
            	CODE LEFT JOIN t_city_code c_parent ON c.parent_code = c_parent.
            	CODE INNER JOIN t_quiz_paper_detail q ON ex.pk_id = q.content_id
            	INNER JOIN t_quiz_bank qb ON q.question_id = qb.pk_id
            	LEFT JOIN t_quiz_paper_student se ON ex.pk_id = se.quiz_paper_id
            	AND s.pk_id = se.student_id
            GROUP BY
            	e.pk_id,
            	ex.title,
            	e.end_time,
            	e.is_start,
            	s.NAME,
            	c_parent.NAME,
            	ex.simple_score,
            	ex.multiple_score,
            	ex.blank_score,
            	sg.grade,
            	COALESCE(se.is_finish, 0) -- 确保分组字段中也处理了null值
            """)
    List<ExamDetailDto> selectExamDetails();
}
