package org.koin.core.parameter;

import b1.f0;
import e0.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.error.NoParameterFoundException;
import org.koin.core.module.KoinDslMarker;
import org.koin.ext.KClassExtKt;
import p0.a;
import x0.c;

@KoinDslMarker
/* loaded from: classes3.dex */
public class ParametersHolder {

    @NotNull
    private final List<Object> _values;
    private int index;

    @Nullable
    private final Boolean useIndexedValues;

    public ParametersHolder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final <T> T getFirstValue(c cVar) {
        T t2;
        Iterator<T> it = this._values.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (((j) cVar).d(t2)) {
                break;
            }
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    private final <T> T getIndexedValue(c cVar) {
        Object obj = this._values.get(this.index);
        T t2 = null;
        if (!((j) cVar).d(obj)) {
            obj = null;
        }
        if (obj != null) {
            t2 = (T) obj;
        }
        if (t2 != null) {
            increaseIndex();
        }
        return t2;
    }

    public static /* synthetic */ void get_values$annotations() {
    }

    @NotNull
    public final ParametersHolder add(@NotNull Object obj) {
        a.s(obj, "value");
        this._values.add(obj);
        return this;
    }

    public final <T> T component1() {
        a.A0();
        throw null;
    }

    public final <T> T component2() {
        a.A0();
        throw null;
    }

    public final <T> T component3() {
        a.A0();
        throw null;
    }

    public final <T> T component4() {
        a.A0();
        throw null;
    }

    public final <T> T component5() {
        a.A0();
        throw null;
    }

    public <T> T elementAt(int i2, @NotNull c cVar) {
        a.s(cVar, "clazz");
        if (this._values.size() > i2) {
            return (T) this._values.get(i2);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i2 + " from " + this + " for type '" + KClassExtKt.getFullName(cVar) + '\'');
    }

    public final <T> T get(int i2) {
        return (T) this._values.get(i2);
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public <T> T getOrNull(@NotNull c cVar) {
        a.s(cVar, "clazz");
        if (this._values.isEmpty()) {
            return null;
        }
        Boolean bool = this.useIndexedValues;
        if (bool != null) {
            return a.g(bool, Boolean.TRUE) ? (T) getIndexedValue(cVar) : (T) getFirstValue(cVar);
        }
        T t2 = (T) getIndexedValue(cVar);
        return t2 == null ? (T) getFirstValue(cVar) : t2;
    }

    @Nullable
    public final Boolean getUseIndexedValues() {
        return this.useIndexedValues;
    }

    @NotNull
    public final List<Object> getValues() {
        return this._values;
    }

    @NotNull
    public final List<Object> get_values() {
        return this._values;
    }

    public final void increaseIndex() {
        if (this.index < f0.p(this._values)) {
            this.index++;
        }
    }

    @NotNull
    public final ParametersHolder insert(int i2, @NotNull Object obj) {
        a.s(obj, "value");
        this._values.add(i2, obj);
        return this;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final <T> void set(int i2, T t2) {
        List<Object> list = this._values;
        a.q(t2, "null cannot be cast to non-null type kotlin.Any");
        list.set(i2, t2);
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }

    public final int size() {
        return this._values.size();
    }

    @NotNull
    public String toString() {
        return "DefinitionParameters" + u.Z0(this._values);
    }

    public ParametersHolder(@NotNull List<Object> list, @Nullable Boolean bool) {
        a.s(list, "_values");
        this._values = list;
        this.useIndexedValues = bool;
    }

    public final <T> T get() {
        a.A0();
        throw null;
    }

    public /* synthetic */ ParametersHolder(List list, Boolean bool, int i2, k kVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? null : bool);
    }

    public final <T> T getOrNull() {
        a.A0();
        throw null;
    }
}
