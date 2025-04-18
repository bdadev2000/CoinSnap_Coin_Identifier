package u2;

import android.database.Cursor;
import java.util.ArrayList;
import v1.f0;
import v1.j0;

/* loaded from: classes.dex */
public final class c {
    public final f0 a;

    /* renamed from: b, reason: collision with root package name */
    public final b f25445b;

    public c(f0 f0Var, int i10) {
        int i11 = 1;
        if (i10 != 1) {
            int i12 = 3;
            if (i10 != 2) {
                if (i10 != 3) {
                    this.a = f0Var;
                    this.f25445b = new b(this, f0Var, 0);
                    return;
                } else {
                    this.a = f0Var;
                    this.f25445b = new b(this, f0Var, 6);
                    return;
                }
            }
            this.a = f0Var;
            this.f25445b = new b(this, f0Var, i12);
            return;
        }
        this.a = f0Var;
        this.f25445b = new b(this, f0Var, i11);
    }

    public final ArrayList a(String str) {
        j0 j3 = j0.j(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            j3.o(1);
        } else {
            j3.i(1, str);
        }
        f0 f0Var = this.a;
        f0Var.assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G(f0Var, j3);
        try {
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                arrayList.add(G.getString(0));
            }
            return arrayList;
        } finally {
            G.close();
            j3.release();
        }
    }

    public final Long b(String str) {
        Long l10;
        j0 j3 = j0.j(1, "SELECT long_value FROM Preference where `key`=?");
        j3.i(1, str);
        f0 f0Var = this.a;
        f0Var.assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G(f0Var, j3);
        try {
            if (G.moveToFirst() && !G.isNull(0)) {
                l10 = Long.valueOf(G.getLong(0));
                return l10;
            }
            l10 = null;
            return l10;
        } finally {
            G.close();
            j3.release();
        }
    }

    public final ArrayList c(String str) {
        j0 j3 = j0.j(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            j3.o(1);
        } else {
            j3.i(1, str);
        }
        f0 f0Var = this.a;
        f0Var.assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G(f0Var, j3);
        try {
            ArrayList arrayList = new ArrayList(G.getCount());
            while (G.moveToNext()) {
                arrayList.add(G.getString(0));
            }
            return arrayList;
        } finally {
            G.close();
            j3.release();
        }
    }

    public final boolean d(String str) {
        boolean z10 = true;
        j0 j3 = j0.j(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            j3.o(1);
        } else {
            j3.i(1, str);
        }
        f0 f0Var = this.a;
        f0Var.assertNotSuspendingTransaction();
        Cursor G = com.facebook.internal.i.G(f0Var, j3);
        try {
            boolean z11 = false;
            if (G.moveToFirst()) {
                if (G.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            G.close();
            j3.release();
        }
    }
}
