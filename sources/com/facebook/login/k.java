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
import com.facebook.internal.m0;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f11238b;

    /* renamed from: c, reason: collision with root package name */
    public final h.f f11239c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.fragment.app.e f11240d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11241f;

    /* renamed from: g, reason: collision with root package name */
    public Messenger f11242g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11243h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11244i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11245j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11246k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11247l;

    public k(Context context, r request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(context, "context");
        String applicationId = request.f11267f;
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f11238b = applicationContext != null ? applicationContext : context;
        this.f11243h = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        this.f11244i = 65537;
        this.f11245j = applicationId;
        this.f11246k = 20121101;
        this.f11247l = request.f11278q;
        this.f11239c = new h.f(this);
    }

    public final void a(Bundle result) {
        boolean z10;
        if (this.f11241f) {
            this.f11241f = false;
            androidx.fragment.app.e eVar = this.f11240d;
            if (eVar != null) {
                n this$0 = (n) eVar.f1610c;
                r request = (r) eVar.f1611d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                this$0.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                k kVar = this$0.f11251d;
                if (kVar != null) {
                    kVar.f11240d = null;
                }
                this$0.f11251d = null;
                w wVar = this$0.f().f11299g;
                if (wVar != null) {
                    View view = wVar.a.f11313g;
                    if (view != null) {
                        view.setVisibility(8);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                        throw null;
                    }
                }
                if (result != null) {
                    List stringArrayList = result.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = CollectionsKt.emptyList();
                    }
                    Set<String> set = request.f11265c;
                    if (set == null) {
                        set = SetsKt.emptySet();
                    }
                    String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
                    boolean z11 = true;
                    if (set.contains(Scopes.OPEN_ID)) {
                        if (string != null && string.length() != 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            this$0.f().m();
                            return;
                        }
                    }
                    if (stringArrayList.containsAll(set)) {
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(result, "result");
                        String string2 = result.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            z11 = false;
                        }
                        if (z11) {
                            w wVar2 = this$0.f().f11299g;
                            if (wVar2 != null) {
                                View view2 = wVar2.a.f11313g;
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                                    throw null;
                                }
                            }
                            String string3 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                            if (string3 != null) {
                                m0.o(new m(result, this$0, request), string3);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        this$0.o(result, request);
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        this$0.a(TextUtils.join(",", hashSet), "new_permissions");
                    }
                    Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
                    request.f11265c = hashSet;
                }
                this$0.f().m();
            }
        }
    }

    @Override // android.content.ServiceConnection
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f11242g = new Messenger(service);
        Bundle data = new Bundle();
        data.putString("com.facebook.platform.extra.APPLICATION_ID", this.f11245j);
        String str = this.f11247l;
        if (str != null) {
            data.putString("com.facebook.platform.extra.NONCE", str);
        }
        Intrinsics.checkNotNullParameter(data, "data");
        Message obtain = Message.obtain((Handler) null, this.f11243h);
        obtain.arg1 = this.f11246k;
        obtain.setData(data);
        obtain.replyTo = new Messenger(this.f11239c);
        try {
            Messenger messenger = this.f11242g;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f11242g = null;
        try {
            this.f11238b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
