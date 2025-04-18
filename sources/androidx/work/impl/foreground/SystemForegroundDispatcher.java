package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestrictTo
/* loaded from: classes3.dex */
public class SystemForegroundDispatcher implements WorkConstraintsCallback, ExecutionListener {

    /* renamed from: k, reason: collision with root package name */
    public static final String f22099k = Logger.e("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final WorkManagerImpl f22100a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskExecutor f22101b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22102c = new Object();
    public String d;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f22103f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f22104g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f22105h;

    /* renamed from: i, reason: collision with root package name */
    public final WorkConstraintsTracker f22106i;

    /* renamed from: j, reason: collision with root package name */
    public Callback f22107j;

    /* loaded from: classes3.dex */
    public interface Callback {
        void a(int i2, Notification notification);

        void c(int i2, int i3, Notification notification);

        void d(int i2);

        void stop();
    }

    public SystemForegroundDispatcher(Context context) {
        WorkManagerImpl b2 = WorkManagerImpl.b(context);
        this.f22100a = b2;
        TaskExecutor taskExecutor = b2.d;
        this.f22101b = taskExecutor;
        this.d = null;
        this.f22103f = new LinkedHashMap();
        this.f22105h = new HashSet();
        this.f22104g = new HashMap();
        this.f22106i = new WorkConstraintsTracker(context, taskExecutor, this);
        b2.f21972f.c(this);
    }

    public static Intent a(Context context, String str, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.f21873a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.f21874b);
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.f21875c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.f21873a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.f21874b);
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.f21875c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.c().a(f22099k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            WorkManagerImpl workManagerImpl = this.f22100a;
            workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl, str, true));
        }
    }

    public final void d(Intent intent) {
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        Logger.c().a(f22099k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f22107j == null) {
            return;
        }
        ForegroundInfo foregroundInfo = new ForegroundInfo(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f22103f;
        linkedHashMap.put(stringExtra, foregroundInfo);
        if (TextUtils.isEmpty(this.d)) {
            this.d = stringExtra;
            this.f22107j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f22107j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i2 |= ((ForegroundInfo) ((Map.Entry) it.next()).getValue()).f21874b;
        }
        ForegroundInfo foregroundInfo2 = (ForegroundInfo) linkedHashMap.get(this.d);
        if (foregroundInfo2 != null) {
            this.f22107j.c(foregroundInfo2.f21873a, i2, foregroundInfo2.f21875c);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void e(String str, boolean z2) {
        Map.Entry entry;
        synchronized (this.f22102c) {
            try {
                WorkSpec workSpec = (WorkSpec) this.f22104g.remove(str);
                if (workSpec != null && this.f22105h.remove(workSpec)) {
                    this.f22106i.d(this.f22105h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) this.f22103f.remove(str);
        if (str.equals(this.d) && this.f22103f.size() > 0) {
            Iterator it = this.f22103f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.d = (String) entry.getKey();
            if (this.f22107j != null) {
                ForegroundInfo foregroundInfo2 = (ForegroundInfo) entry.getValue();
                this.f22107j.c(foregroundInfo2.f21873a, foregroundInfo2.f21874b, foregroundInfo2.f21875c);
                this.f22107j.d(foregroundInfo2.f21873a);
            }
        }
        Callback callback = this.f22107j;
        if (foregroundInfo == null || callback == null) {
            return;
        }
        Logger.c().a(f22099k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(foregroundInfo.f21873a), str, Integer.valueOf(foregroundInfo.f21874b)), new Throwable[0]);
        callback.d(foregroundInfo.f21873a);
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public final void f(List list) {
    }

    public final void g() {
        this.f22107j = null;
        synchronized (this.f22102c) {
            this.f22106i.e();
        }
        this.f22100a.f21972f.g(this);
    }
}
