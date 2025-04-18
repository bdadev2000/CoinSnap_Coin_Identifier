package org.koin.core.scope;

import android.support.v4.media.d;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import d0.h;
import d0.i;
import e0.n;
import e0.q;
import e0.t;
import e0.u;
import e0.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingPropertyException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.instance.InstanceContext;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import x0.c;

@KoinDslMarker
/* loaded from: classes.dex */
public final class Scope {

    @NotNull
    private final ArrayList<ScopeCallback> _callbacks;
    private boolean _closed;

    @NotNull
    private final Koin _koin;

    @NotNull
    private final ThreadLocal<n> _parameterStackLocal;

    @Nullable
    private Object _source;

    @NotNull
    private final String id;
    private final boolean isRoot;

    @NotNull
    private final ArrayList<Scope> linkedScopes;

    @NotNull
    private final Qualifier scopeQualifier;

    public /* synthetic */ Scope(Qualifier qualifier, String str, boolean z2, Koin koin, int i2, k kVar) {
        this(qualifier, str, (i2 & 4) != 0 ? false : z2, koin);
    }

    public static void declare$default(Scope scope, Object obj, Qualifier qualifier, List list, boolean z2, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            list = w.f30218a;
        }
        a.s(list, "secondaryTypes");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        a.A0();
        throw null;
    }

    private final <T> T findInOtherScope(c cVar, Qualifier qualifier, q0.a aVar) {
        Iterator<Scope> it = this.linkedScopes.iterator();
        T t2 = null;
        while (it.hasNext() && (t2 = (T) it.next().getOrNull(cVar, qualifier, aVar)) == null) {
        }
        return t2;
    }

    public static /* synthetic */ Object get$default(Scope scope, c cVar, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return scope.get(cVar, qualifier, aVar);
    }

    private final <T> T getFromSource(c cVar) {
        T t2;
        if (!((j) cVar).d(this._source) || (t2 = (T) this._source) == null) {
            return null;
        }
        return t2;
    }

    public static /* synthetic */ Object getOrNull$default(Scope scope, c cVar, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return scope.getOrNull(cVar, qualifier, aVar);
    }

    public static /* synthetic */ void get_koin$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void get_parameterStackLocal$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void get_source$annotations() {
    }

    public static h inject$default(Scope scope, Qualifier qualifier, i iVar, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = i.f30131a;
        }
        a.s(iVar, "mode");
        a.A0();
        throw null;
    }

    public static h injectOrNull$default(Scope scope, Qualifier qualifier, i iVar, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iVar = i.f30131a;
        }
        a.s(iVar, "mode");
        a.A0();
        throw null;
    }

    private final <T> T resolveInstance(Qualifier qualifier, c cVar, q0.a aVar) {
        if (this._closed) {
            throw new ClosedScopeException(d.r(new StringBuilder("Scope '"), this.id, "' is closed"));
        }
        n nVar = null;
        ParametersHolder parametersHolder = aVar != null ? (ParametersHolder) aVar.invoke() : null;
        if (parametersHolder != null) {
            this._koin.getLogger().log(Level.DEBUG, new Scope$resolveInstance$1(parametersHolder));
            nVar = this._parameterStackLocal.get();
            if (nVar == null) {
                nVar = new n();
                this._parameterStackLocal.set(nVar);
            }
            nVar.addFirst(parametersHolder);
        }
        T t2 = (T) resolveValue(qualifier, cVar, new InstanceContext(this._koin.getLogger(), this, parametersHolder), aVar);
        if (nVar != null) {
            this._koin.getLogger().debug("| << parameters");
            if (!nVar.isEmpty()) {
                nVar.removeFirst();
            }
        }
        return t2;
    }

    private final <T> T resolveValue(Qualifier qualifier, c cVar, InstanceContext instanceContext, q0.a aVar) {
        Object obj;
        ParametersHolder parametersHolder;
        T t2 = (T) this._koin.getInstanceRegistry().resolveInstance$koin_core(qualifier, cVar, this.scopeQualifier, instanceContext);
        if (t2 == null) {
            this._koin.getLogger().debug("|- ? t:'" + KClassExtKt.getFullName(cVar) + "' - q:'" + qualifier + "' look in injected parameters");
            n nVar = this._parameterStackLocal.get();
            Object obj2 = null;
            t2 = (nVar == null || (parametersHolder = (ParametersHolder) nVar.f()) == null) ? null : (T) parametersHolder.getOrNull(cVar);
            if (t2 == null) {
                if (!this.isRoot) {
                    this._koin.getLogger().debug("|- ? t:'" + KClassExtKt.getFullName(cVar) + "' - q:'" + qualifier + "' look at scope source");
                    Object obj3 = this._source;
                    if (obj3 != null && ((j) cVar).d(obj3) && qualifier == null && (obj = this._source) != null) {
                        obj2 = obj;
                    }
                }
                t2 = (T) obj2;
                if (t2 == null) {
                    this._koin.getLogger().debug("|- ? t:'" + KClassExtKt.getFullName(cVar) + "' - q:'" + qualifier + "' look in other scopes");
                    t2 = (T) findInOtherScope(cVar, qualifier, aVar);
                    if (t2 == null) {
                        if (aVar != null) {
                            this._parameterStackLocal.remove();
                            this._koin.getLogger().debug("|- << parameters");
                        }
                        throwDefinitionNotFound(qualifier, cVar);
                        throw new RuntimeException();
                    }
                }
            }
        }
        return t2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r5 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void throwDefinitionNotFound(org.koin.core.qualifier.Qualifier r5, x0.c r6) {
        /*
            r4 = this;
            r0 = 39
            if (r5 == 0) goto L17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " and qualifier '"
            r1.<init>(r2)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            if (r5 != 0) goto L19
        L17:
            java.lang.String r5 = ""
        L19:
            org.koin.core.error.NoBeanDefFoundException r1 = new org.koin.core.error.NoBeanDefFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No definition found for type '"
            r2.<init>(r3)
            java.lang.String r6 = org.koin.ext.KClassExtKt.getFullName(r6)
            r2.append(r6)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = ". Check your Modules configuration and add missing type and/or qualifier!"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.throwDefinitionNotFound(org.koin.core.qualifier.Qualifier, x0.c):java.lang.Void");
    }

    public final void close() {
        KoinPlatformTools.INSTANCE.m818synchronized(this, new Scope$close$1(this));
    }

    public final void create$koin_core(@NotNull List<Scope> list) {
        a.s(list, "links");
        this.linkedScopes.addAll(list);
    }

    public final <T> void declare(T t2, Qualifier qualifier, List<? extends c> list, boolean z2) {
        a.s(list, "secondaryTypes");
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        a.A0();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T get(@org.jetbrains.annotations.NotNull x0.c r9, @org.jetbrains.annotations.Nullable org.koin.core.qualifier.Qualifier r10, @org.jetbrains.annotations.Nullable q0.a r11) {
        /*
            r8 = this;
            java.lang.String r0 = "clazz"
            p0.a.s(r9, r0)
            org.koin.core.Koin r0 = r8._koin
            org.koin.core.logger.Logger r0 = r0.getLogger()
            org.koin.core.logger.Level r1 = org.koin.core.logger.Level.DEBUG
            boolean r0 = r0.isAt(r1)
            if (r0 == 0) goto L8f
            r0 = 39
            if (r10 == 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " with qualifier '"
            r2.<init>(r3)
            r2.append(r10)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L2c
        L2a:
            java.lang.String r2 = ""
        L2c:
            org.koin.core.Koin r3 = r8._koin
            org.koin.core.logger.Logger r3 = r3.getLogger()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "|- '"
            r4.<init>(r5)
            java.lang.String r6 = org.koin.ext.KClassExtKt.getFullName(r9)
            r4.append(r6)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " ..."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.display(r1, r0)
            org.koin.mp.KoinPlatformTimeTools r0 = org.koin.mp.KoinPlatformTimeTools.INSTANCE
            long r2 = r0.getTimeInNanoSeconds()
            java.lang.Object r10 = r8.resolveInstance(r10, r9, r11)
            long r6 = r0.getTimeInNanoSeconds()
            long r6 = r6 - r2
            double r2 = (double) r6
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r2 = r2 / r6
            org.koin.core.Koin r11 = r8._koin
            org.koin.core.logger.Logger r11 = r11.getLogger()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            java.lang.String r9 = org.koin.ext.KClassExtKt.getFullName(r9)
            r0.append(r9)
            java.lang.String r9 = "' in "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r9 = " ms"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r11.display(r1, r9)
            goto L93
        L8f:
            java.lang.Object r10 = r8.resolveInstance(r10, r9, r11)
        L93:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.core.scope.Scope.get(x0.c, org.koin.core.qualifier.Qualifier, q0.a):java.lang.Object");
    }

    public final <T> List<T> getAll() {
        a.A0();
        throw null;
    }

    public final boolean getClosed() {
        return this._closed;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Koin getKoin() {
        return this._koin;
    }

    @NotNull
    public final Logger getLogger() {
        return this._koin.getLogger();
    }

    @Nullable
    public final <T> T getOrNull(@NotNull c cVar, @Nullable Qualifier qualifier, @Nullable q0.a aVar) {
        a.s(cVar, "clazz");
        try {
            return (T) get(cVar, qualifier, aVar);
        } catch (ClosedScopeException unused) {
            this._koin.getLogger().debug("* Scope closed - no instance found for " + KClassExtKt.getFullName(cVar) + " on scope " + this);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            this._koin.getLogger().debug("* No instance found for type '" + KClassExtKt.getFullName(cVar) + "' on scope '" + this + '\'');
            return null;
        }
    }

    @NotNull
    public final <T> T getProperty(@NotNull String str, @NotNull T t2) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(t2, "defaultValue");
        return (T) this._koin.getProperty(str, t2);
    }

    @Nullable
    public final <T> T getPropertyOrNull(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_KEY);
        return (T) this._koin.getProperty(str);
    }

    @NotNull
    public final Scope getScope(@NotNull String str) {
        a.s(str, "scopeID");
        return getKoin().getScope(str);
    }

    @NotNull
    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final <T> T getSource() {
        get_source();
        a.A0();
        throw null;
    }

    @NotNull
    public final Koin get_koin() {
        return this._koin;
    }

    @NotNull
    public final ThreadLocal<n> get_parameterStackLocal() {
        return this._parameterStackLocal;
    }

    @Nullable
    public final Object get_source() {
        return this._source;
    }

    public final <T> h inject(Qualifier qualifier, i iVar, q0.a aVar) {
        a.s(iVar, "mode");
        a.A0();
        throw null;
    }

    public final <T> h injectOrNull(Qualifier qualifier, i iVar, q0.a aVar) {
        a.s(iVar, "mode");
        a.A0();
        throw null;
    }

    public final boolean isNotClosed() {
        return !getClosed();
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final void linkTo(@NotNull Scope... scopeArr) {
        a.s(scopeArr, "scopes");
        if (this.isRoot) {
            throw new IllegalStateException("Can't add scope link to a root scope".toString());
        }
        t.u0(this.linkedScopes, scopeArr);
    }

    public final void registerCallback(@NotNull ScopeCallback scopeCallback) {
        a.s(scopeCallback, "callback");
        this._callbacks.add(scopeCallback);
    }

    public final void set_source(@Nullable Object obj) {
        this._source = obj;
    }

    @NotNull
    public String toString() {
        return d.r(new StringBuilder("['"), this.id, "']");
    }

    public final void unlink(@NotNull Scope... scopeArr) {
        a.s(scopeArr, "scopes");
        if (this.isRoot) {
            throw new IllegalStateException("Can't remove scope link to a root scope".toString());
        }
        ArrayList<Scope> arrayList = this.linkedScopes;
        a.s(arrayList, "<this>");
        if (!(scopeArr.length == 0)) {
            arrayList.removeAll(q.J(scopeArr));
        }
    }

    public Scope(@NotNull Qualifier qualifier, @NotNull String str, boolean z2, @NotNull Koin koin) {
        a.s(qualifier, "scopeQualifier");
        a.s(str, "id");
        a.s(koin, "_koin");
        this.scopeQualifier = qualifier;
        this.id = str;
        this.isRoot = z2;
        this._koin = koin;
        this.linkedScopes = new ArrayList<>();
        this._callbacks = new ArrayList<>();
        this._parameterStackLocal = new ThreadLocal<>();
    }

    public static Object get$default(Scope scope, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        a.A0();
        throw null;
    }

    public static Object getOrNull$default(Scope scope, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        a.A0();
        throw null;
    }

    @NotNull
    public final <T> List<T> getAll(@NotNull c cVar) {
        a.s(cVar, "clazz");
        List<T> all$koin_core = this._koin.getInstanceRegistry().getAll$koin_core(cVar, new InstanceContext(this._koin.getLogger(), this, null, 4, null));
        ArrayList<Scope> arrayList = this.linkedScopes;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            t.t0(arrayList2, ((Scope) it.next()).getAll(cVar));
        }
        return u.P0(arrayList2, all$koin_core);
    }

    @NotNull
    public final <T> T getProperty(@NotNull String str) {
        a.s(str, SDKConstants.PARAM_KEY);
        T t2 = (T) this._koin.getProperty(str);
        if (t2 != null) {
            return t2;
        }
        throw new MissingPropertyException(androidx.compose.foundation.text.input.a.A("Property '", str, "' not found"));
    }

    public final <T> T getOrNull(Qualifier qualifier, q0.a aVar) {
        a.A0();
        throw null;
    }

    public final <T> T get(Qualifier qualifier, q0.a aVar) {
        a.A0();
        throw null;
    }
}
