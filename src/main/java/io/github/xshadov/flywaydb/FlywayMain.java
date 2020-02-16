package io.github.xshadov.flywaydb;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.MigrationVersion;

public class FlywayMain {
	public static void main(String[] args) {
		Flyway flyway = Flyway.configure()
				.dataSource("jdbc:h2:tcp://localhost/~/test", "sa", null)
				.baselineVersion(MigrationVersion.fromVersion("2"))
				.baselineOnMigrate(true)
				.load();

		// Start the migration
		flyway.migrate();
	}
}
