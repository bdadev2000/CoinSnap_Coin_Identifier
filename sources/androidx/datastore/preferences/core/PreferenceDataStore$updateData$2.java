package androidx.datastore.preferences.core;

import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {Opcodes.CASTORE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PreferenceDataStore$updateData$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19092a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f19094c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStore$updateData$2(p pVar, g gVar) {
        super(2, gVar);
        this.f19094c = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.f19094c, gVar);
        preferenceDataStore$updateData$2.f19093b = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferenceDataStore$updateData$2) create((Preferences) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f19092a;
        if (i2 == 0) {
            q.m(obj);
            Preferences preferences = (Preferences) this.f19093b;
            this.f19092a = 1;
            obj = this.f19094c.invoke(preferences, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        Preferences preferences2 = (Preferences) obj;
        ((MutablePreferences) preferences2).f19089b.set(true);
        return preferences2;
    }
}
