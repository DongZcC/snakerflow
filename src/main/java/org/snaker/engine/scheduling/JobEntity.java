/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine.scheduling;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.snaker.engine.entity.Task;

/**
 * job实体，用于传递给具体的调度框架
 * @author yuqs
 * @since 1.4
 */
public class JobEntity implements Serializable {
	private static final long serialVersionUID = 5807718947643229134L;
	/**
	 * job id
	 */
	private String id;
	/**
	 * 节点模型名称
	 */
	private String modelName;
	/**
	 * job类型
	 */
	private int jobType;
	/**
	 * 任务对象
	 */
	private Task task;
	/**
	 * 启动时间
	 */
	private Date startTime;
	/**
	 * 间隔时间
	 */
	private long period;
	/**
	 * 执行参数
	 */
	private Map<String, Object> args;
	
	public JobEntity(Task task, Date startTime) {
		this.task = task;
		this.startTime = startTime;
	}
	
	public JobEntity(Task task, Date startTime, long period) {
		this.task = task;
		this.startTime = startTime;
		this.period = period;
	}
	
	public JobEntity(Task task, Date startTime, Map<String, Object> args) {
		this.task = task;
		this.startTime = startTime;
		this.args = args;
	}
	
	public JobEntity(Task task, Date startTime, long period, Map<String, Object> args) {
		this.task = task;
		this.startTime = startTime;
		this.period = period;
		this.args = args;
	}
	
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public long getPeriod() {
		return period;
	}
	public void setPeriod(long period) {
		this.period = period;
	}
	public Map<String, Object> getArgs() {
		return args;
	}
	public void setArgs(Map<String, Object> args) {
		this.args = args;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getJobType() {
		return jobType;
	}

	public void setJobType(int jobType) {
		this.jobType = jobType;
	}
}
