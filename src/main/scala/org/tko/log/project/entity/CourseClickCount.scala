package org.tko.log.project.entity

/**
  * 日点击量
  *
  * @param day_course hbase中的rowkey 20171111_131
  * @param click_count      日点击量
  */
case class CourseClickCount(day_course: String, click_count: Int)
