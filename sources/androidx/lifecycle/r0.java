package androidx.lifecycle;

import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class r0 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, int i10) {
        super(0);
        this.f1818b = i10;
        this.f1819c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z1.j compileStatement;
        a2.g sQLiteOpenHelper;
        int i10 = this.f1818b;
        Object obj = this.f1819c;
        switch (i10) {
            case 0:
                return jb.g.i((e1) obj);
            case 1:
                compileStatement = r2.database.compileStatement(((v1.n0) obj).createQuery());
                return compileStatement;
            case 2:
                a2.h hVar = (a2.h) obj;
                int i11 = 10;
                Object obj2 = null;
                if (hVar.f69c != null && hVar.f71f) {
                    Context context = hVar.f68b;
                    Intrinsics.checkNotNullParameter(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                    sQLiteOpenHelper = new a2.g(hVar.f68b, new File(noBackupFilesDir, hVar.f69c).getAbsolutePath(), new kc.c(obj2, i11), hVar.f70d, hVar.f72g);
                } else {
                    sQLiteOpenHelper = new a2.g(hVar.f68b, hVar.f69c, new kc.c(obj2, i11), hVar.f70d, hVar.f72g);
                }
                boolean z10 = hVar.f74i;
                Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
                sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
                return sQLiteOpenHelper;
            case 3:
                return new sc.p((y0.j) obj);
            case 4:
                return invoke();
            default:
                return invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        r6 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r4, "!", 0, false, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [n0.l1] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List invoke() {
        /*
            Method dump skipped, instructions count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.r0.invoke():java.util.List");
    }
}
