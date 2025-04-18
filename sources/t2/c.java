package t2;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.i;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.p;
import d.d;
import j2.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m2.k;
import o.e;
import v2.j;

/* loaded from: classes.dex */
public final class c implements q2.b, m2.a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f25180m = p.g("SystemFgDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public final Context f25181b;

    /* renamed from: c, reason: collision with root package name */
    public final k f25182c;

    /* renamed from: d, reason: collision with root package name */
    public final x2.a f25183d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f25184f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public String f25185g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f25186h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f25187i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f25188j;

    /* renamed from: k, reason: collision with root package name */
    public final q2.c f25189k;

    /* renamed from: l, reason: collision with root package name */
    public b f25190l;

    public c(Context context) {
        this.f25181b = context;
        k v10 = k.v(context);
        this.f25182c = v10;
        x2.a aVar = v10.f21461l;
        this.f25183d = aVar;
        this.f25185g = null;
        this.f25186h = new LinkedHashMap();
        this.f25188j = new HashSet();
        this.f25187i = new HashMap();
        this.f25189k = new q2.c(context, aVar, this);
        v10.f21463n.a(this);
    }

    public static Intent a(Context context, String str, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f2198b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f2199c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f2198b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f2199c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // q2.b
    public final void b(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                p.e().b(f25180m, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                k kVar = this.f25182c;
                ((h.c) kVar.f21461l).r(new j(kVar, str, true));
            }
        }
    }

    @Override // m2.a
    public final void d(String str, boolean z10) {
        boolean z11;
        Map.Entry entry;
        synchronized (this.f25184f) {
            try {
                u2.j jVar = (u2.j) this.f25187i.remove(str);
                if (jVar != null) {
                    z11 = this.f25188j.remove(jVar);
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f25189k.b(this.f25188j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i iVar = (i) this.f25186h.remove(str);
        int i10 = 1;
        if (str.equals(this.f25185g) && this.f25186h.size() > 0) {
            Iterator it = this.f25186h.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f25185g = (String) entry.getKey();
            if (this.f25190l != null) {
                i iVar2 = (i) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f25190l;
                systemForegroundService.f2215c.post(new e(systemForegroundService, iVar2.a, iVar2.f2199c, iVar2.f2198b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f25190l;
                systemForegroundService2.f2215c.post(new r(iVar2.a, i10, systemForegroundService2));
            }
        }
        b bVar = this.f25190l;
        if (iVar != null && bVar != null) {
            p.e().b(f25180m, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(iVar.a), str, Integer.valueOf(iVar.f2198b)), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) bVar;
            systemForegroundService3.f2215c.post(new r(iVar.a, i10, systemForegroundService3));
        }
    }

    public final void e(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        p.e().b(f25180m, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification != null && this.f25190l != null) {
            i iVar = new i(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.f25186h;
            linkedHashMap.put(stringExtra, iVar);
            if (TextUtils.isEmpty(this.f25185g)) {
                this.f25185g = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f25190l;
                systemForegroundService.f2215c.post(new e(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f25190l;
            systemForegroundService2.f2215c.post(new d(systemForegroundService2, intExtra, notification, 8));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= ((i) ((Map.Entry) it.next()).getValue()).f2198b;
                }
                i iVar2 = (i) linkedHashMap.get(this.f25185g);
                if (iVar2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f25190l;
                    systemForegroundService3.f2215c.post(new e(systemForegroundService3, iVar2.a, iVar2.f2199c, i10));
                }
            }
        }
    }

    @Override // q2.b
    public final void f(List list) {
    }
}
