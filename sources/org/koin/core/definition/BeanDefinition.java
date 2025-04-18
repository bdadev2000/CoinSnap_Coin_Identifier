package org.koin.core.definition;

import e0.w;
import java.util.List;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.qualifier.Qualifier;
import p0.a;
import q0.p;
import x0.c;

@KoinDslMarker
/* loaded from: classes2.dex */
public final class BeanDefinition<T> {
    private boolean _createdAtStart;

    @NotNull
    private Callbacks<T> callbacks;

    @NotNull
    private final p definition;

    @NotNull
    private final Kind kind;

    @NotNull
    private final c primaryType;

    @Nullable
    private Qualifier qualifier;

    @NotNull
    private final Qualifier scopeQualifier;

    @NotNull
    private List<? extends c> secondaryTypes;

    public BeanDefinition(@NotNull Qualifier qualifier, @NotNull c cVar, @Nullable Qualifier qualifier2, @NotNull p pVar, @NotNull Kind kind, @NotNull List<? extends c> list) {
        a.s(qualifier, "scopeQualifier");
        a.s(cVar, "primaryType");
        a.s(pVar, "definition");
        a.s(kind, "kind");
        a.s(list, "secondaryTypes");
        this.scopeQualifier = qualifier;
        this.primaryType = cVar;
        this.qualifier = qualifier2;
        this.definition = pVar;
        this.kind = kind;
        this.secondaryTypes = list;
        this.callbacks = new Callbacks<>(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BeanDefinition copy$default(BeanDefinition beanDefinition, Qualifier qualifier, c cVar, Qualifier qualifier2, p pVar, Kind kind, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qualifier = beanDefinition.scopeQualifier;
        }
        if ((i2 & 2) != 0) {
            cVar = beanDefinition.primaryType;
        }
        c cVar2 = cVar;
        if ((i2 & 4) != 0) {
            qualifier2 = beanDefinition.qualifier;
        }
        Qualifier qualifier3 = qualifier2;
        if ((i2 & 8) != 0) {
            pVar = beanDefinition.definition;
        }
        p pVar2 = pVar;
        if ((i2 & 16) != 0) {
            kind = beanDefinition.kind;
        }
        Kind kind2 = kind;
        if ((i2 & 32) != 0) {
            list = beanDefinition.secondaryTypes;
        }
        return beanDefinition.copy(qualifier, cVar2, qualifier3, pVar2, kind2, list);
    }

    public static /* synthetic */ void get_createdAtStart$annotations() {
    }

    @NotNull
    public final Qualifier component1() {
        return this.scopeQualifier;
    }

    @NotNull
    public final c component2() {
        return this.primaryType;
    }

    @Nullable
    public final Qualifier component3() {
        return this.qualifier;
    }

    @NotNull
    public final p component4() {
        return this.definition;
    }

    @NotNull
    public final Kind component5() {
        return this.kind;
    }

    @NotNull
    public final List<c> component6() {
        return this.secondaryTypes;
    }

    @NotNull
    public final BeanDefinition<T> copy(@NotNull Qualifier qualifier, @NotNull c cVar, @Nullable Qualifier qualifier2, @NotNull p pVar, @NotNull Kind kind, @NotNull List<? extends c> list) {
        a.s(qualifier, "scopeQualifier");
        a.s(cVar, "primaryType");
        a.s(pVar, "definition");
        a.s(kind, "kind");
        a.s(list, "secondaryTypes");
        return new BeanDefinition<>(qualifier, cVar, qualifier2, pVar, kind, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        a.q(obj, "null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        BeanDefinition beanDefinition = (BeanDefinition) obj;
        return a.g(this.primaryType, beanDefinition.primaryType) && a.g(this.qualifier, beanDefinition.qualifier) && a.g(this.scopeQualifier, beanDefinition.scopeQualifier);
    }

    @NotNull
    public final Callbacks<T> getCallbacks() {
        return this.callbacks;
    }

    @NotNull
    public final p getDefinition() {
        return this.definition;
    }

    @NotNull
    public final Kind getKind() {
        return this.kind;
    }

    @NotNull
    public final c getPrimaryType() {
        return this.primaryType;
    }

    @Nullable
    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    @NotNull
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    @NotNull
    public final List<c> getSecondaryTypes() {
        return this.secondaryTypes;
    }

    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public final boolean hasType(@NotNull c cVar) {
        a.s(cVar, "clazz");
        return a.g(this.primaryType, cVar) || this.secondaryTypes.contains(cVar);
    }

    public int hashCode() {
        Qualifier qualifier = this.qualifier;
        return this.scopeQualifier.hashCode() + ((this.primaryType.hashCode() + ((qualifier != null ? qualifier.hashCode() : 0) * 31)) * 31);
    }

    public final boolean is(@NotNull c cVar, @Nullable Qualifier qualifier, @NotNull Qualifier qualifier2) {
        a.s(cVar, "clazz");
        a.s(qualifier2, "scopeDefinition");
        return hasType(cVar) && a.g(this.qualifier, qualifier) && a.g(this.scopeQualifier, qualifier2);
    }

    public final void setCallbacks(@NotNull Callbacks<T> callbacks) {
        a.s(callbacks, "<set-?>");
        this.callbacks = callbacks;
    }

    public final void setQualifier(@Nullable Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    public final void setSecondaryTypes(@NotNull List<? extends c> list) {
        a.s(list, "<set-?>");
        this.secondaryTypes = list;
    }

    public final void set_createdAtStart(boolean z2) {
        this._createdAtStart = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r2 == null) goto L6;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r11 = this;
            org.koin.core.definition.Kind r0 = r11.kind
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "'"
            r1.<init>(r2)
            x0.c r2 = r11.primaryType
            java.lang.String r2 = org.koin.ext.KClassExtKt.getFullName(r2)
            r1.append(r2)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.koin.core.qualifier.Qualifier r2 = r11.qualifier
            java.lang.String r3 = ""
            if (r2 == 0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = ",qualifier:"
            r2.<init>(r4)
            org.koin.core.qualifier.Qualifier r4 = r11.qualifier
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L38
        L37:
            r2 = r3
        L38:
            org.koin.core.qualifier.Qualifier r4 = r11.scopeQualifier
            org.koin.core.registry.ScopeRegistry$Companion r5 = org.koin.core.registry.ScopeRegistry.Companion
            org.koin.core.qualifier.StringQualifier r5 = r5.getRootScopeQualifier()
            boolean r4 = p0.a.g(r4, r5)
            if (r4 == 0) goto L48
            r4 = r3
            goto L58
        L48:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = ",scope:"
            r4.<init>(r5)
            org.koin.core.qualifier.Qualifier r5 = r11.scopeQualifier
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L58:
            java.util.List<? extends x0.c> r5 = r11.secondaryTypes
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L7b
            java.util.List<? extends x0.c> r3 = r11.secondaryTypes
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.String r6 = ","
            r7 = 0
            r8 = 0
            org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1 r9 = org.koin.core.definition.BeanDefinition$toString$defOtherTypes$typesAsString$1.INSTANCE
            r10 = 30
            java.lang.String r3 = e0.u.K0(r5, r6, r7, r8, r9, r10)
            java.lang.String r5 = ",binds:"
            java.lang.String r3 = r5.concat(r3)
        L7b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "["
            r5.<init>(r6)
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            r5.append(r1)
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.definition.BeanDefinition.toString():java.lang.String");
    }

    public /* synthetic */ BeanDefinition(Qualifier qualifier, c cVar, Qualifier qualifier2, p pVar, Kind kind, List list, int i2, k kVar) {
        this(qualifier, cVar, (i2 & 4) != 0 ? null : qualifier2, pVar, kind, (i2 & 32) != 0 ? w.f30218a : list);
    }
}
