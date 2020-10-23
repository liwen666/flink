package org.apache.flink.runtime.webmonitor;

import org.apache.flink.runtime.entrypoint.StandaloneSessionClusterEntrypoint;
import org.apache.flink.runtime.taskexecutor.TaskManagerRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 描述.
 * </p>
 *
 * @since 2020/10/23 17:39.
 */
public class Application {
	private static Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		StandaloneSessionClusterEntrypoint.main(args);
		try {
			TaskManagerRunner.main(args);
		} catch (Exception e) {
			log.error("TaskManagerRunner error:{}", e);
		}
	}
}
