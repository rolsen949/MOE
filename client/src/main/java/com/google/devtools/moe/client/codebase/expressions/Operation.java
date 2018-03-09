/*
 * Copyright (c) 2011 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.moe.client.codebase.expressions;

import com.google.auto.value.AutoValue;

/**
 * An Operation in the MOE Expression Language is an operator followed by a term.
 *
 * <p>E.g., |patch(file="/path/to/path.txt") or >public
 */
@AutoValue
public abstract class Operation {

  public abstract Operator operator();

  public abstract Term term();

  @Override
  public String toString() {
    return "" + operator() + term();
  }

  public static Operation create(Operator operator, Term term) {
    return new AutoValue_Operation(operator, term);
  }
}