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

    /* renamed from: a, reason: collision with root package name */
    private he f7899a;
    private ListView b;

    /* loaded from: classes.dex */
    public class a implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fe f7900a;

        /* renamed from: com.applovin.impl.ge$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0017a implements r.b {
            public C0017a() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f7900a);
            }
        }

        public a(fe feVar) {
            this.f7900a = feVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() == he.a.TEST_ADS.ordinal()) {
                com.applovin.impl.sdk.k o3 = this.f7900a.o();
                fe.b x9 = this.f7900a.x();
                if (ge.this.f7899a.a(hbVar)) {
                    if (fe.b.READY == x9) {
                        r.a(ge.this, MaxDebuggerMultiAdActivity.class, o3.e(), new C0017a());
                        return;
                    } else if (fe.b.DISABLED == x9) {
                        o3.n0().a();
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
        he heVar = this.f7899a;
        if (heVar != null) {
            return heVar.h().o();
        }
        return null;
    }

    public void initialize(fe feVar) {
        setTitle(feVar.g());
        he heVar = new he(feVar, this);
        this.f7899a = heVar;
        heVar.a(new a(feVar));
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.b = listView;
        listView.setAdapter((ListAdapter) this.f7899a);
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f7899a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f7899a.k();
            this.f7899a.c();
        }
    }
}
