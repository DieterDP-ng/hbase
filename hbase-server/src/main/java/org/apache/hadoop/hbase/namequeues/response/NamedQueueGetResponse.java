/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hbase.namequeues.response;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.hadoop.hbase.namequeues.NamedQueuePayload;
import org.apache.hadoop.hbase.shaded.protobuf.generated.TooSlowLog;
import org.apache.yetus.audience.InterfaceAudience;
import java.util.List;

/**
 * Response object to be sent by namedQueue service back to caller
 */
@InterfaceAudience.Private
public class NamedQueueGetResponse {

  private List<TooSlowLog.SlowLogPayload> slowLogPayloads;
  private NamedQueuePayload.NamedQueueEvent namedQueueEvent;

  public List<TooSlowLog.SlowLogPayload> getSlowLogPayloads() {
    return slowLogPayloads;
  }

  public void setSlowLogPayloads(List<TooSlowLog.SlowLogPayload> slowLogPayloads) {
    this.slowLogPayloads = slowLogPayloads;
  }

  public NamedQueuePayload.NamedQueueEvent getNamedQueueEvent() {
    return namedQueueEvent;
  }

  public void setNamedQueueEvent(NamedQueuePayload.NamedQueueEvent namedQueueEvent) {
    this.namedQueueEvent = namedQueueEvent;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
      .append("slowLogPayloads", slowLogPayloads)
      .append("namedQueueEvent", namedQueueEvent)
      .toString();
  }

}
