package com.github.m50d.footless

sealed trait Path

case object Master extends Path

case object Mountain extends Path

case object World extends Path

case class Garden() extends Path

sealed trait MC

case object Koan extends MC

case object Meditation extends MC

case object Insight extends MC
