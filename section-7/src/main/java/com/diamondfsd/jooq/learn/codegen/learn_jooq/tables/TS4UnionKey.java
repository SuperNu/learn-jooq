/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen.learn_jooq.tables;


import com.diamondfsd.jooq.learn.codegen.learn_jooq.Indexes;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.Keys;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.LearnJooq;
import com.diamondfsd.jooq.learn.codegen.learn_jooq.tables.records.S4UnionKeyRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TS4UnionKey extends TableImpl<S4UnionKeyRecord> {

    private static final long serialVersionUID = -1319227131;

    /**
     * The reference instance of <code>learn-jooq.s4_union_key</code>
     */
    public static final TS4UnionKey S4_UNION_KEY = new TS4UnionKey();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<S4UnionKeyRecord> getRecordType() {
        return S4UnionKeyRecord.class;
    }

    /**
     * The column <code>learn-jooq.s4_union_key.uk_1</code>. 联合ID1
     */
    public final TableField<S4UnionKeyRecord, Integer> UK_1 = createField(DSL.name("uk_1"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "联合ID1");

    /**
     * The column <code>learn-jooq.s4_union_key.uk_2</code>. 联合ID2
     */
    public final TableField<S4UnionKeyRecord, Integer> UK_2 = createField(DSL.name("uk_2"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "联合ID2");

    /**
     * The column <code>learn-jooq.s4_union_key.create_time</code>. 创建时间
     */
    public final TableField<S4UnionKeyRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>learn-jooq.s4_union_key.update_time</code>. 更新时间
     */
    public final TableField<S4UnionKeyRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "更新时间");

    /**
     * Create a <code>learn-jooq.s4_union_key</code> table reference
     */
    public TS4UnionKey() {
        this(DSL.name("s4_union_key"), null);
    }

    /**
     * Create an aliased <code>learn-jooq.s4_union_key</code> table reference
     */
    public TS4UnionKey(String alias) {
        this(DSL.name(alias), S4_UNION_KEY);
    }

    /**
     * Create an aliased <code>learn-jooq.s4_union_key</code> table reference
     */
    public TS4UnionKey(Name alias) {
        this(alias, S4_UNION_KEY);
    }

    private TS4UnionKey(Name alias, Table<S4UnionKeyRecord> aliased) {
        this(alias, aliased, null);
    }

    private TS4UnionKey(Name alias, Table<S4UnionKeyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TS4UnionKey(Table<O> child, ForeignKey<O, S4UnionKeyRecord> key) {
        super(child, key, S4_UNION_KEY);
    }

    @Override
    public Schema getSchema() {
        return LearnJooq.LEARN_JOOQ;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.S4_UNION_KEY_PRIMARY);
    }

    @Override
    public UniqueKey<S4UnionKeyRecord> getPrimaryKey() {
        return Keys.KEY_S4_UNION_KEY_PRIMARY;
    }

    @Override
    public List<UniqueKey<S4UnionKeyRecord>> getKeys() {
        return Arrays.<UniqueKey<S4UnionKeyRecord>>asList(Keys.KEY_S4_UNION_KEY_PRIMARY);
    }

    @Override
    public TS4UnionKey as(String alias) {
        return new TS4UnionKey(DSL.name(alias), this);
    }

    @Override
    public TS4UnionKey as(Name alias) {
        return new TS4UnionKey(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TS4UnionKey rename(String name) {
        return new TS4UnionKey(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TS4UnionKey rename(Name name) {
        return new TS4UnionKey(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
