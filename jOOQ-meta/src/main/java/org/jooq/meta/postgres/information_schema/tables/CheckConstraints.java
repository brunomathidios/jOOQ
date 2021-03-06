/**
 * This class is generated by jOOQ
 */
package org.jooq.meta.postgres.information_schema.tables;


import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraints extends TableImpl<Record> {

	private static final long serialVersionUID = 869216817;

	/**
	 * The reference instance of <code>information_schema.check_constraints</code>
	 */
	public static final CheckConstraints CHECK_CONSTRAINTS = new CheckConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>information_schema.check_constraints.constraint_catalog</code>.
	 */
	public final TableField<Record, String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.check_constraints.constraint_schema</code>.
	 */
	public final TableField<Record, String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.check_constraints.constraint_name</code>.
	 */
	public final TableField<Record, String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>information_schema.check_constraints.check_clause</code>.
	 */
	public final TableField<Record, String> CHECK_CLAUSE = createField("check_clause", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>information_schema.check_constraints</code> table reference
	 */
	public CheckConstraints() {
		this("check_constraints", null);
	}

	/**
	 * Create an aliased <code>information_schema.check_constraints</code> table reference
	 */
	public CheckConstraints(String alias) {
		this(alias, CHECK_CONSTRAINTS);
	}

	private CheckConstraints(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private CheckConstraints(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CheckConstraints as(String alias) {
		return new CheckConstraints(alias, this);
	}

	/**
	 * Rename this table
	 */
	public CheckConstraints rename(String name) {
		return new CheckConstraints(name, null);
	}
}
