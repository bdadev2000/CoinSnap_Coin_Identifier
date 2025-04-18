package com.applovin.impl;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.ec;
import com.applovin.impl.ke;
import com.applovin.impl.me;
import com.applovin.impl.r;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes.dex */
public abstract class le extends se {

    /* renamed from: a, reason: collision with root package name */
    private me f25076a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f25077b;

    /* loaded from: classes.dex */
    public class a implements ec.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ke f25078a;

        /* renamed from: com.applovin.impl.le$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0082a implements r.b {
            public C0082a() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f25078a);
            }
        }

        public a(ke keVar) {
            this.f25078a = keVar;
        }

        @Override // com.applovin.impl.ec.a
        public void a(lb lbVar, dc dcVar) {
            if (lbVar.b() != me.a.TEST_ADS.ordinal()) {
                yp.a(dcVar.c(), dcVar.b(), le.this);
                return;
            }
            com.applovin.impl.sdk.j o2 = this.f25078a.o();
            ke.b y2 = this.f25078a.y();
            if (!le.this.f25076a.a(lbVar)) {
                yp.a(dcVar.c(), dcVar.b(), le.this);
                return;
            }
            if (ke.b.READY == y2) {
                r.a(le.this, MaxDebuggerMultiAdActivity.class, o2.e(), new C0082a());
            } else if (ke.b.DISABLED != y2) {
                yp.a(dcVar.c(), dcVar.b(), le.this);
            } else {
                o2.l0().a();
                yp.a(dcVar.c(), dcVar.b(), le.this);
            }
        }
    }

    public le() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        me meVar = this.f25076a;
        if (meVar != null) {
            return meVar.h().o();
        }
        return null;
    }

    public void initialize(ke keVar) {
        setTitle(keVar.g());
        me meVar = new me(keVar, this);
        this.f25076a = meVar;
        meVar.a(new a(keVar));
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f25077b = listView;
        listView.setAdapter((ListAdapter) this.f25076a);
    }

    @Override // com.applovin.impl.se, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f25076a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f25076a.k();
            this.f25076a.c();
        }
    }
}
