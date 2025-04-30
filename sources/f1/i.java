package F1;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import n1.C2475f;
import r0.AbstractC2654b;
import t7.InterfaceC2717f;

/* loaded from: classes.dex */
public final class i implements InterfaceC2717f {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1084c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1085d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1086f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1087g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1088h;

    public i(B1.a aVar, B1.b bVar, B1.b bVar2, B1.b bVar3, B1.b bVar4) {
        this.b = 0;
        this.f1084c = aVar;
        this.f1085d = bVar;
        this.f1086f = bVar2;
        this.f1087g = bVar3;
        this.f1088h = bVar4;
    }

    public static i a(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        i iVar = new i(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) iVar.f1087g)) {
            try {
                ((ArrayDeque) iVar.f1087g).clear();
                String string = ((SharedPreferences) iVar.f1084c).getString((String) iVar.f1085d, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) iVar.f1086f)) {
                    String[] split = string.split((String) iVar.f1086f, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) iVar.f1087g).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return iVar;
    }

    @Override // t7.InterfaceC2717f
    public Object getValue() {
        b0 b0Var = (b0) this.f1088h;
        if (b0Var == null) {
            f0 f0Var = (f0) ((F7.a) this.f1085d).invoke();
            d0 d0Var = (d0) ((F7.a) this.f1086f).invoke();
            AbstractC2654b abstractC2654b = (AbstractC2654b) ((F7.a) this.f1087g).invoke();
            G7.j.e(f0Var, "store");
            G7.j.e(d0Var, "factory");
            G7.j.e(abstractC2654b, "extras");
            b0 o3 = new C2475f(f0Var, d0Var, abstractC2654b).o((M7.b) this.f1084c);
            this.f1088h = o3;
            return o3;
        }
        return b0Var;
    }

    public String toString() {
        switch (this.b) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f1084c) + ", mProviderPackage: " + ((String) this.f1085d) + ", mQuery: " + ((String) this.f1086f) + ", mCertificates:");
                int i9 = 0;
                while (true) {
                    List list = (List) this.f1087g;
                    if (i9 < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(i9);
                        for (int i10 = 0; i10 < list2.size(); i10++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        i9++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public i(Drawable.Callback callback) {
        this.b = 4;
        this.f1084c = new E1.d(1, false);
        this.f1085d = new HashMap();
        this.f1086f = new HashMap();
        this.f1088h = ".ttf";
        if (!(callback instanceof View)) {
            H1.c.b("LottieDrawable must be inside of a view for images to work.");
            this.f1087g = null;
        } else {
            this.f1087g = ((View) callback).getContext().getAssets();
        }
    }

    public i(G7.e eVar, F7.a aVar, F7.a aVar2, F7.a aVar3) {
        this.b = 3;
        this.f1084c = eVar;
        this.f1085d = aVar;
        this.f1086f = aVar2;
        this.f1087g = aVar3;
    }

    public i(String str, List list, String str2, String str3) {
        this.b = 1;
        str.getClass();
        this.f1084c = str;
        str2.getClass();
        this.f1085d = str2;
        this.f1086f = str3;
        list.getClass();
        this.f1087g = list;
        this.f1088h = str + "-" + str2 + "-" + str3;
    }

    public i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = 2;
        this.f1087g = new ArrayDeque();
        this.f1084c = sharedPreferences;
        this.f1085d = "topic_operation_queue";
        this.f1086f = ",";
        this.f1088h = scheduledThreadPoolExecutor;
    }
}
