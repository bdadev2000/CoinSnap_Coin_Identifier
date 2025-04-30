package com.facebook.login;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.H;
import com.google.android.gms.common.Scopes;
import com.google.ar.core.ImageMetadata;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n1.C2475f;
import u7.C2824o;
import u7.C2826q;

/* loaded from: classes.dex */
public final class l implements ServiceConnection {
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final com.facebook.internal.C f13725c;

    /* renamed from: d, reason: collision with root package name */
    public F2.e f13726d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13727f;

    /* renamed from: g, reason: collision with root package name */
    public Messenger f13728g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13729h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13730i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13731j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13732k;
    public final String l;

    public l(Context context, q qVar) {
        G7.j.e(qVar, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        String str = qVar.f13746f;
        G7.j.e(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext != null ? applicationContext : context;
        this.f13729h = 65536;
        this.f13730i = ImageMetadata.CONTROL_AE_EXPOSURE_COMPENSATION;
        this.f13731j = str;
        this.f13732k = 20121101;
        this.l = qVar.f13755q;
        this.f13725c = new com.facebook.internal.C(this);
    }

    public final void a(Bundle bundle) {
        if (!this.f13727f) {
            return;
        }
        this.f13727f = false;
        F2.e eVar = this.f13726d;
        if (eVar != null) {
            m mVar = (m) eVar.f1131c;
            G7.j.e(mVar, "this$0");
            q qVar = (q) eVar.f1132d;
            G7.j.e(qVar, "$request");
            l lVar = mVar.f13733d;
            if (lVar != null) {
                lVar.f13726d = null;
            }
            mVar.f13733d = null;
            C2475f c2475f = mVar.e().f13773g;
            if (c2475f != null) {
                View view = ((w) c2475f.f21833c).f13784g;
                if (view != null) {
                    view.setVisibility(8);
                } else {
                    G7.j.k("progressBar");
                    throw null;
                }
            }
            if (bundle != null) {
                List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                if (stringArrayList == null) {
                    stringArrayList = C2824o.b;
                }
                Set<String> set = qVar.f13744c;
                if (set == null) {
                    set = C2826q.b;
                }
                String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                if (set.contains(Scopes.OPEN_ID) && (string == null || string.length() == 0)) {
                    mVar.e().k();
                    return;
                }
                if (stringArrayList.containsAll(set)) {
                    String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                    if (string2 != null && string2.length() != 0) {
                        mVar.m(qVar, bundle);
                        return;
                    }
                    C2475f c2475f2 = mVar.e().f13773g;
                    if (c2475f2 != null) {
                        View view2 = ((w) c2475f2.f21833c).f13784g;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        } else {
                            G7.j.k("progressBar");
                            throw null;
                        }
                    }
                    String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                    if (string3 != null) {
                        H.p(new C.c(bundle, mVar, qVar, 19), string3);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mVar.a("new_permissions", TextUtils.join(",", hashSet));
                }
                qVar.f13744c = hashSet;
            }
            mVar.e().k();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        G7.j.e(componentName, "name");
        G7.j.e(iBinder, NotificationCompat.CATEGORY_SERVICE);
        this.f13728g = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f13731j);
        String str = this.l;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message obtain = Message.obtain((Handler) null, this.f13729h);
        obtain.arg1 = this.f13732k;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f13725c);
        try {
            Messenger messenger = this.f13728g;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        G7.j.e(componentName, "name");
        this.f13728g = null;
        try {
            this.b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
