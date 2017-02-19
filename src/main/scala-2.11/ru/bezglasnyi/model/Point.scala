package ru.bezglasnyi.model

import java.time.LocalDateTime

/**
  * Created by pbezglasnyi.
  */
case class Point(id: Long, name: String, lon: Double, lat: Double)

case class Grid(tile_x: Int, tile_y: Int, distance_error: Double)

case class User(id: Long, name: String)

case class Visit(id: Long, point: Point, user: User, datetime: LocalDateTime)

