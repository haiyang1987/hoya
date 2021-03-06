/*
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

package org.apache.hoya.yarn;

/**
 * Actions.
 * Only some of these are supported by specific Hoya Services; they
 * are listed here to ensure the names are consistent
 */
public interface HoyaActions {
  String ACTION_AM_SUICIDE = "am-suicide";
  String ACTION_BUILD = "build";
  String ACTION_CREATE = "create";
  String ACTION_DESTROY = "destroy";
  String ACTION_ECHO = "echo";
  String ACTION_EMERGENCY_FORCE_KILL = "emergency-force-kill";
  String ACTION_EXISTS = "exists";
  String ACTION_FLEX = "flex";
  String ACTION_FREEZE = "freeze";
  String ACTION_GETCONF = "getconf";
  String ACTION_HELP = "help";
  String ACTION_KILL_CONTAINER = "kill-container";
  String ACTION_LIST = "list";
  String ACTION_MIGRATE = "migrate";
  String ACTION_MONITOR = "monitor";
  String ACTION_PREFLIGHT = "preflight";
  String ACTION_RECONFIGURE = "reconfigure";
  String ACTION_REIMAGE = "reimage";
  String ACTION_STATUS = "status";
  String ACTION_THAW = "thaw";
  String ACTION_USAGE = "usage";
  String ACTION_VERSION = "version";
  String DESCRIBE_ACTION_AM_SUICIDE =
    "Tell the Hoya Application Master to simulate a process failure by terminating itself";
  String DESCRIBE_ACTION_BUILD =
    "Build a Hoya cluster specification -but do not start it";
  String DESCRIBE_ACTION_CREATE =
      "Create a live Hoya cluster";
  String DESCRIBE_ACTION_DESTROY =
        "Destroy a frozen Hoya cluster)";
  String DESCRIBE_ACTION_FORCE_KILL =
          "Force kill an application by its YARN application ID";
  String DESCRIBE_ACTION_EXISTS =
            "Probe for a cluster running";
  String DESCRIBE_ACTION_FLEX = "Flex a Hoya cluster";
  String DESCRIBE_ACTION_FREEZE =
              "Freeze/suspend a running cluster";
  String DESCRIBE_ACTION_GETCONF =
                "Get the configuration of a cluster";
  String DESCRIBE_ACTION_KILL_CONTAINER =
    "Kill a container in the cluster";
  String DESCRIBE_ACTION_HELP = "Print help information";
  String DESCRIBE_ACTION_LIST =
                  "List running Hoya clusters";
  String DESCRIBE_ACTION_MONITOR =
                    "Monitor a running cluster";
  String DESCRIBE_ACTION_STATUS =
                      "Get the status of a cluster";
  String DESCRIBE_ACTION_THAW =
                        "Thaw a frozen cluster";
  String DESCRIBE_ACTION_VERSION =
                        "Print the Hoya version information";
}
