---
title: 【java.time.*】 - README
type: "tags"
tags:
  - 包结构
javaname: README
srcpath: java.time
---

```cmd
java.time（日期，时间，瞬间和持续时间的主要API）
   ├── chrono（除默认ISO之外的日历系统的通用API）
   ├── format（提供用于打印和分析日期和时间的类）
   ├── temporal（使用字段和单位以及日期时间调整器访问日期和时间）
   ├── zone（支持时区及其规则）
   └─ *.java（日期时间相关基础类）
```

<!-- more -->

## 包简介

包含与开发bean相关的类 - 基于 JavaBeans™ 体系结构的组件。

## 详细目录
```cmd
java.time
    ├── Clock.java
    ├── DateTimeException.java
    ├── DayOfWeek.java
    ├── Duration.java
    ├── Instant.java
    ├── LocalDate.java
    ├── LocalDateTime.java
    ├── LocalTime.java
    ├── Month.java
    ├── MonthDay.java
    ├── OffsetDateTime.java
    ├── OffsetTime.java
    ├── Period.java
    ├── Ser.java
    ├── Year.java
    ├── YearMonth.java
    ├── ZoneId.java
    ├── ZoneOffset.java
    ├── ZoneRegion.java
    ├── ZonedDateTime.java
    ├── chrono
    │   ├── AbstractChronology.java
    │   ├── ChronoLocalDate.java
    │   ├── ChronoLocalDateImpl.java
    │   ├── ChronoLocalDateTime.java
    │   ├── ChronoLocalDateTimeImpl.java
    │   ├── ChronoPeriod.java
    │   ├── ChronoPeriodImpl.java
    │   ├── ChronoZonedDateTime.java
    │   ├── ChronoZonedDateTimeImpl.java
    │   ├── Chronology.java
    │   ├── Era.java
    │   ├── HijrahChronology.java
    │   ├── HijrahDate.java
    │   ├── HijrahEra.java
    │   ├── IsoChronology.java
    │   ├── IsoEra.java
    │   ├── JapaneseChronology.java
    │   ├── JapaneseDate.java
    │   ├── JapaneseEra.java
    │   ├── MinguoChronology.java
    │   ├── MinguoDate.java
    │   ├── MinguoEra.java
    │   ├── Ser.java
    │   ├── ThaiBuddhistChronology.java
    │   ├── ThaiBuddhistDate.java
    │   ├── ThaiBuddhistEra.java
    │   └── package-info.java
    ├── format
    │   ├── DateTimeFormatter.java
    │   ├── DateTimeFormatterBuilder.java
    │   ├── DateTimeParseContext.java
    │   ├── DateTimeParseException.java
    │   ├── DateTimePrintContext.java
    │   ├── DateTimeTextProvider.java
    │   ├── DecimalStyle.java
    │   ├── FormatStyle.java
    │   ├── Parsed.java
    │   ├── ResolverStyle.java
    │   ├── SignStyle.java
    │   ├── TextStyle.java
    │   ├── ZoneName.java
    │   └── package-info.java
    ├── package-info.java
    ├── temporal
    │   ├── ChronoField.java
    │   ├── ChronoUnit.java
    │   ├── IsoFields.java
    │   ├── JulianFields.java
    │   ├── Temporal.java
    │   ├── TemporalAccessor.java
    │   ├── TemporalAdjuster.java
    │   ├── TemporalAdjusters.java
    │   ├── TemporalAmount.java
    │   ├── TemporalField.java
    │   ├── TemporalQueries.java
    │   ├── TemporalQuery.java
    │   ├── TemporalUnit.java
    │   ├── UnsupportedTemporalTypeException.java
    │   ├── ValueRange.java
    │   ├── WeekFields.java
    │   └── package-info.java
    └── zone
        ├── Ser.java
        ├── TzdbZoneRulesProvider.java
        ├── ZoneOffsetTransition.java
        ├── ZoneOffsetTransitionRule.java
        ├── ZoneRules.java
        ├── ZoneRulesException.java
        ├── ZoneRulesProvider.java
        └── package-info.java

```