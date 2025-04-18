package androidx.activity;

import android.database.Cursor;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import v1.f0;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f573b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f574c;

    public /* synthetic */ i(Object obj, int i10) {
        this.f573b = i10;
        this.f574c = obj;
    }

    public final Set a() {
        v1.u uVar = (v1.u) this.f574c;
        Set createSetBuilder = SetsKt.createSetBuilder();
        Cursor query$default = f0.query$default(uVar.a, new hi.e("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        try {
            Cursor cursor = query$default;
            while (cursor.moveToNext()) {
                createSetBuilder.add(Integer.valueOf(cursor.getInt(0)));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(query$default, null);
            Set build = SetsKt.build(createSetBuilder);
            if (!build.isEmpty()) {
                if (((v1.u) this.f574c).f25946h != null) {
                    z1.j jVar = ((v1.u) this.f574c).f25946h;
                    if (jVar != null) {
                        jVar.D();
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return build;
        } finally {
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.i.run():void");
    }
}
