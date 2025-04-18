package d;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import androidx.activity.h;
import androidx.core.app.f;
import androidx.emoji2.text.j;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;
import o.g;
import ye.l;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16783b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16784c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16785d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16786f;

    public /* synthetic */ d(Object obj, int i10, Object obj2, int i11) {
        this.f16783b = i11;
        this.f16786f = obj;
        this.f16784c = i10;
        this.f16785d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.activity.result.b bVar;
        int i10 = this.f16783b;
        boolean z10 = true;
        int i11 = 0;
        Object obj = this.f16786f;
        int i12 = this.f16784c;
        Object obj2 = this.f16785d;
        switch (i10) {
            case 0:
                ((e) obj).a(i12, (Bundle) obj2);
                return;
            case 1:
                h hVar = (h) obj;
                Object obj3 = ((f.a) obj2).f17509c;
                String str = (String) hVar.a.get(Integer.valueOf(i12));
                if (str != null) {
                    androidx.activity.result.e eVar = (androidx.activity.result.e) hVar.f605e.get(str);
                    if (eVar != null && (bVar = eVar.a) != null) {
                        if (hVar.f604d.remove(str)) {
                            bVar.a(obj3);
                            return;
                        }
                        return;
                    } else {
                        hVar.f607g.remove(str);
                        hVar.f606f.put(str, obj3);
                        return;
                    }
                }
                return;
            case 2:
                ((h) obj).a(i12, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj2));
                return;
            case 3:
                ((g) obj).f22930c.onNavigationEvent(i12, (Bundle) obj2);
                return;
            case 4:
                String[] strArr = (String[]) obj2;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) obj;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                while (i11 < length) {
                    iArr[i11] = packageManager.checkPermission(strArr[i11], packageName);
                    i11++;
                }
                ((f) activity).onRequestPermissionsResult(i12, strArr, iArr);
                return;
            case 5:
                s.a aVar = (s.a) ((fb.c) obj2).f17773c;
                if (aVar != null) {
                    aVar.n(i12);
                    return;
                }
                return;
            case 6:
                List list = (List) obj2;
                int size = list.size();
                if (i12 != 1) {
                    while (i11 < size) {
                        ((j) list.get(i11)).getClass();
                        i11++;
                    }
                    return;
                } else {
                    while (i11 < size) {
                        ((j) list.get(i11)).a();
                        i11++;
                    }
                    return;
                }
            case 7:
                ((o2.h) obj2).a(i12, (Intent) obj);
                return;
            case 8:
                ((SystemForegroundService) obj).f2218g.notify(i12, (Notification) obj2);
                return;
            case 9:
                ((BottomSheetBehavior) obj).L((View) obj2, i12, false);
                return;
            default:
                Matrix matrix = new Matrix();
                l lVar = (l) obj;
                float f10 = lVar.f28178d;
                float f11 = f10 / 2.0f;
                float f12 = lVar.f28179e;
                float f13 = f12 / 2.0f;
                if (i12 % 180 == 0) {
                    z10 = false;
                }
                if (z10) {
                    float f14 = f12 / f10;
                    matrix.postScale(f14, 1.0f / f14, f11, f13);
                }
                matrix.postRotate(i12, f11, f13);
                ((TextureView) lVar.f28176b).setTransform(matrix);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Intent intent, int i10) {
        this.f16783b = 7;
        this.f16785d = obj;
        this.f16786f = intent;
        this.f16784c = i10;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10, int i11) {
        this.f16783b = i11;
        this.f16786f = obj;
        this.f16785d = obj2;
        this.f16784c = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(androidx.emoji2.text.j r3, int r4) {
        /*
            r2 = this;
            r0 = 6
            r2.f16783b = r0
            r0 = 1
            androidx.emoji2.text.j[] r0 = new androidx.emoji2.text.j[r0]
            if (r3 == 0) goto L16
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r0 = 0
            java.util.List r3 = (java.util.List) r3
            r2.<init>(r3, r4, r0)
            return
        L16:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "initCallback cannot be null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d.d.<init>(androidx.emoji2.text.j, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(ArrayList arrayList, int i10) {
        this(arrayList, i10, (Throwable) null);
        this.f16783b = 6;
    }

    public d(List list, int i10, Throwable th2) {
        this.f16783b = 6;
        if (list != null) {
            this.f16785d = new ArrayList(list);
            this.f16784c = i10;
            this.f16786f = th2;
            return;
        }
        throw new NullPointerException("initCallbacks cannot be null");
    }
}
