/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.javaagent.instrumentation.finaglehttp.v23_11;

import static java.util.Collections.singletonList;

import com.google.auto.service.AutoService;
import io.opentelemetry.javaagent.extension.instrumentation.InstrumentationModule;
import io.opentelemetry.javaagent.extension.instrumentation.TypeInstrumentation;
import java.util.List;

@AutoService(InstrumentationModule.class)
public class TwitterUtilCoreInstrumentationModule extends InstrumentationModule {

  public TwitterUtilCoreInstrumentationModule() {
    super("twitter-util-core");
  }

  @Override
  public List<TypeInstrumentation> typeInstrumentations() {
    return singletonList(new LocalSchedulerActivationInstrumentation());
  }
}
