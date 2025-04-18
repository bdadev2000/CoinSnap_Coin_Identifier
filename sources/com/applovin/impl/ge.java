package com.applovin.impl;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.fe;
import com.applovin.impl.he;
import com.applovin.impl.r;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class ge extends ne {
    private he a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f4926b;

    /* loaded from: classes.dex */
    public class a implements zb.a {
        final /* synthetic */ fe a;

        /* renamed from: com.applovin.impl.ge$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0017a implements r.b {
            public C0017a() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.a);
            }
        }

        public a(fe feVar) {
            this.a = feVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() == he.a.TEST_ADS.ordinal()) {
                com.applovin.impl.sdk.k o10 = this.a.o();
                fe.b x10 = this.a.x();
                if (ge.this.a.a(hbVar)) {
                    if (fe.b.READY == x10) {
                        r.a(ge.this, MaxDebuggerMultiAdActivity.class, o10.e(), new C0017a());
                        return;
                    } else if (fe.b.DISABLED == x10) {
                        o10.n0().a();
                        zp.a(ybVar.c(), ybVar.b(), ge.this);
                        return;
                    } else {
                        zp.a(ybVar.c(), ybVar.b(), ge.this);
                        return;
                    }
                }
                zp.a(ybVar.c(), ybVar.b(), ge.this);
                return;
            }
            zp.a(ybVar.c(), ybVar.b(), ge.this);
        }
    }

    public ge() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.ne
    public com.applovin.impl.sdk.k getSdk() {
        he heVar = this.a;
        if (heVar != null) {
            return heVar.h().o();
        }
        return null;
    }

    public void initialize(fe feVar) {
        setTitle(feVar.g());
        he heVar = new he(feVar, this);
        this.a = heVar;
        heVar.a(new a(feVar));
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f4926b = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.a.k();
            this.a.c();
        }
    }
}
