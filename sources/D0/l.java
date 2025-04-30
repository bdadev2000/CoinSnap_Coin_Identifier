package D0;

import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Shader;
import android.util.Log;
import d4.C2181i;
import d4.C2187o;
import d4.J;
import i8.A;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f625a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f626c;

    /* renamed from: d, reason: collision with root package name */
    public Object f627d;

    public /* synthetic */ l(byte b, int i9) {
        this.f625a = i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static D0.l c(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.l.c(android.content.res.Resources, int, android.content.res.Resources$Theme):D0.l");
    }

    public static void d(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e4) {
                Log.w("SupportSQLite", "delete failed: ", e4);
            }
        }
    }

    public Q4.b a() {
        String str;
        if (((Long) this.f627d) == null) {
            str = " tokenExpirationTimestamp";
        } else {
            str = "";
        }
        if (str.isEmpty()) {
            return new Q4.b((String) this.f626c, ((Long) this.f627d).longValue(), this.b);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public J b() {
        C2187o c2187o = (C2187o) this.f627d;
        if (c2187o == null) {
            J b = J.b(this.b, (Object[]) this.f626c, this);
            C2187o c2187o2 = (C2187o) this.f627d;
            if (c2187o2 == null) {
                return b;
            }
            throw c2187o2.a();
        }
        throw c2187o.a();
    }

    public String e() {
        StringBuilder sb = new StringBuilder("$");
        int i9 = this.b + 1;
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj = ((Object[]) this.f626c)[i10];
            if (obj instanceof c8.g) {
                c8.g gVar = (c8.g) obj;
                if (G7.j.a(gVar.getKind(), c8.l.f5454e)) {
                    if (((int[]) this.f627d)[i10] != -1) {
                        sb.append("[");
                        sb.append(((int[]) this.f627d)[i10]);
                        sb.append("]");
                    }
                } else {
                    int i11 = ((int[]) this.f627d)[i10];
                    if (i11 >= 0) {
                        sb.append(".");
                        sb.append(gVar.g(i11));
                    }
                }
            } else if (obj != g8.l.f20507a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        G7.j.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public boolean f() {
        ColorStateList colorStateList;
        if (((Shader) this.f626c) == null && (colorStateList = (ColorStateList) this.f627d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003a A[EDGE_INSN: B:79:0x003a->B:63:0x003a BREAK  A[LOOP:3: B:43:0x0024->B:64:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(I0.b r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.l.g(I0.b, int, int):void");
    }

    public void h(Object obj, Object obj2) {
        int i9 = (this.b + 1) * 2;
        Object[] objArr = (Object[]) this.f626c;
        if (i9 > objArr.length) {
            this.f626c = Arrays.copyOf(objArr, C2181i.d(objArr.length, i9));
        }
        z2.i.b(obj, obj2);
        Object[] objArr2 = (Object[]) this.f626c;
        int i10 = this.b;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.b = i10 + 1;
    }

    public void i(I0.b bVar) {
        bVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public String toString() {
        switch (this.f625a) {
            case 7:
                return e();
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((A) this.f626c) == A.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.f627d);
                String sb2 = sb.toString();
                G7.j.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public l(A a6, int i9, String str) {
        this.f625a = 8;
        this.f626c = a6;
        this.b = i9;
        this.f627d = str;
    }

    public l(Shader shader, ColorStateList colorStateList, int i9) {
        this.f625a = 2;
        this.f626c = shader;
        this.f627d = colorStateList;
        this.b = i9;
    }

    public l(a aVar, E1.c cVar) {
        this.f625a = 0;
        this.b = 12;
        this.f626c = aVar;
        this.f627d = cVar;
    }

    public l(int i9) {
        this.f625a = 6;
        this.f626c = new Object[i9 * 2];
        this.b = 0;
    }

    public l(P1.m mVar) {
        this.f625a = 4;
        this.f627d = k2.d.a(150, new E1.c(this, 9));
        this.f626c = mVar;
    }
}
