package org.koin.core.instance;

import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes.dex */
public final class InstanceContext {

    @NotNull
    private final Logger logger;

    @Nullable
    private final ParametersHolder parameters;

    @NotNull
    private final Scope scope;

    public InstanceContext(@NotNull Logger logger, @NotNull Scope scope, @Nullable ParametersHolder parametersHolder) {
        a.s(logger, "logger");
        a.s(scope, "scope");
        this.logger = logger;
        this.scope = scope;
        this.parameters = parametersHolder;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @Nullable
    public final ParametersHolder getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }

    public /* synthetic */ InstanceContext(Logger logger, Scope scope, ParametersHolder parametersHolder, int i2, k kVar) {
        this(logger, scope, (i2 & 4) != 0 ? null : parametersHolder);
    }
}
