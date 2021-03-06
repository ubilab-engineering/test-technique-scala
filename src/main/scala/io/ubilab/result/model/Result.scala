package io.ubilab.result.model

import java.util.Date

case class EventResult(
    id:        String, // created | received | seen
    idOwner:   Int,
    createdAt: Date
)

case class Result(id:              Int,
                  idOwner:         Int,
                  idRecipients:    List[Int],
                  isSeen:          Boolean,
                  eventResults:    List[EventResult],
                  contentOfResult: String)
