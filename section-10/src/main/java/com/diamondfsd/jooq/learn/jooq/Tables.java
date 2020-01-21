/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.jooq;


import com.diamondfsd.jooq.learn.jooq.tables.TS1User;
import com.diamondfsd.jooq.learn.jooq.tables.TS2UserMessage;
import com.diamondfsd.jooq.learn.jooq.tables.TS4ColumenGt22;
import com.diamondfsd.jooq.learn.jooq.tables.TS4NoPrimary;
import com.diamondfsd.jooq.learn.jooq.tables.TS4UnionKey;
import com.diamondfsd.jooq.learn.jooq.tables.TS9News;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in learn-jooq
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * USER TABLE
     */
    public static final TS1User S1_USER = TS1User.S1_USER;

    /**
     * 用户消息内容
     */
    public static final TS2UserMessage S2_USER_MESSAGE = TS2UserMessage.S2_USER_MESSAGE;

    /**
     * 表字段超22
     */
    public static final TS4ColumenGt22 S4_COLUMEN_GT22 = TS4ColumenGt22.S4_COLUMEN_GT22;

    /**
     * The table <code>learn-jooq.s4_no_primary</code>.
     */
    public static final TS4NoPrimary S4_NO_PRIMARY = TS4NoPrimary.S4_NO_PRIMARY;

    /**
     * The table <code>learn-jooq.s4_union_key</code>.
     */
    public static final TS4UnionKey S4_UNION_KEY = TS4UnionKey.S4_UNION_KEY;

    /**
     * 新闻表
     */
    public static final TS9News S9_NEWS = TS9News.S9_NEWS;
}