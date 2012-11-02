package liquibase.structure.core;

import liquibase.structure.AbstractDatabaseObject;
import liquibase.structure.DatabaseObject;

public class Sequence extends AbstractDatabaseObject {
    private String name;
    private Schema schema;


    public DatabaseObject[] getContainingObjects() {
        return null;
    }

    public String getName() {
        return name;
    }

    public Sequence setName(String name) {
        this.name = name;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sequence sequence = (Sequence) o;

        return !(name != null ? !name.equalsIgnoreCase(sequence.name) : sequence.name != null);

    }

    @Override
    public int hashCode() {
        return (name != null ? name.toUpperCase().hashCode() : 0);
    }


    @Override
    public String toString() {
        return getName();
    }

	/**
	 * @return Returns the schema.
	 */
	public Schema getSchema () {
		return schema;
	}

	/**
	 * @param schema The schema to set.
	 */
	public Sequence setSchema (Schema schema) {
		this.schema = schema;
        return this;
	}
}