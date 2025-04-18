package androidx.datastore.preferences.core;

import d0.b0;
import e0.e0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PreferencesKt$edit$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19097a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f19099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesKt$edit$2(p pVar, g gVar) {
        super(2, gVar);
        this.f19099c = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.f19099c, gVar);
        preferencesKt$edit$2.f19098b = obj;
        return preferencesKt$edit$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesKt$edit$2) create((Preferences) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f19097a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.f19098b;
            q.m(obj);
            return mutablePreferences;
        }
        q.m(obj);
        MutablePreferences mutablePreferences2 = new MutablePreferences(e0.z(((Preferences) this.f19098b).a()), false);
        this.f19098b = mutablePreferences2;
        this.f19097a = 1;
        return this.f19099c.invoke(mutablePreferences2, this) == aVar ? aVar : mutablePreferences2;
    }
}
