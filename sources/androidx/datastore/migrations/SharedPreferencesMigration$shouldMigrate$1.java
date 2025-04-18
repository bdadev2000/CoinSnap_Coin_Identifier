package androidx.datastore.migrations;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", l = {Opcodes.I2S}, m = "shouldMigrate")
/* loaded from: classes3.dex */
public final class SharedPreferencesMigration$shouldMigrate$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferencesMigration f19063a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SharedPreferencesMigration f19065c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration$shouldMigrate$1(SharedPreferencesMigration sharedPreferencesMigration, g gVar) {
        super(gVar);
        this.f19065c = sharedPreferencesMigration;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f19064b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19065c.b(this);
    }
}
