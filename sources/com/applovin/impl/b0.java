package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.dc;
import com.applovin.impl.ec;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b0 extends se {

    /* renamed from: a, reason: collision with root package name */
    private z f22970a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.j f22971b;

    /* renamed from: c, reason: collision with root package name */
    private ec f22972c;

    /* loaded from: classes2.dex */
    public class a extends ec {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z f22973f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, z zVar) {
            super(context);
            this.f22973f = zVar;
        }

        @Override // com.applovin.impl.ec
        public int b() {
            return this.f22973f.g().size();
        }

        @Override // com.applovin.impl.ec
        public List c(int i2) {
            ArrayList arrayList = new ArrayList();
            a0 a0Var = (a0) this.f22973f.g().get(i2);
            arrayList.add(b0.this.c(a0Var.c()));
            if (a0Var.b() != null) {
                arrayList.add(b0.this.a("AB Test Experiment Name", a0Var.b()));
            }
            kr d = a0Var.d();
            b0 b0Var = b0.this;
            arrayList.add(b0Var.a("Device ID Targeting", b0Var.a(d.a())));
            b0 b0Var2 = b0.this;
            arrayList.add(b0Var2.a("Device Type Targeting", b0Var2.b(d.b())));
            if (d.c() != null) {
                arrayList.add(b0.this.a(d.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.ec
        public int d(int i2) {
            a0 a0Var = (a0) this.f22973f.g().get(i2);
            return (a0Var.b() != null ? 1 : 0) + 3 + (a0Var.d().c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.ec
        public dc e(int i2) {
            return i2 == b.TARGETED_WATERFALL.ordinal() ? new fj("TARGETED WATERFALL FOR CURRENT DEVICE") : i2 == b.OTHER_WATERFALLS.ordinal() ? new fj("OTHER WATERFALLS") : new fj("");
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.se, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.se
    public com.applovin.impl.sdk.j getSdk() {
        return this.f22971b;
    }

    public void initialize(z zVar, com.applovin.impl.sdk.j jVar) {
        this.f22970a = zVar;
        this.f22971b = jVar;
        a aVar = new a(this, zVar);
        this.f22972c = aVar;
        aVar.a(new os(this, 0, jVar, zVar));
        this.f22972c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f22970a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f22972c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.se, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ec ecVar = this.f22972c;
        if (ecVar != null) {
            ecVar.a((ec.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        return str.equals("phone") ? "Phones" : str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dc c(String str) {
        return dc.a(dc.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return str.equals("idfa") ? "IDFA Only" : str.equals("dnt") ? "No IDFA Only" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, lb lbVar, com.applovin.impl.sdk.j jVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, (a0) zVar.g().get(lbVar.b()), null, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, lb lbVar, com.applovin.impl.sdk.j jVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        a0 a0Var = (a0) zVar.g().get(lbVar.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(a0Var.c(), a0Var.d().c(), jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.j jVar, final z zVar, final lb lbVar, dc dcVar) {
        if (lbVar.a() == 0) {
            final int i2 = 0;
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new r.b() { // from class: com.applovin.impl.ps
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    int i3 = i2;
                    lb lbVar2 = lbVar;
                    z zVar2 = zVar;
                    com.applovin.impl.sdk.j jVar2 = jVar;
                    switch (i3) {
                        case 0:
                            b0.a(zVar2, lbVar2, jVar2, (MaxDebuggerAdUnitDetailActivity) activity);
                            return;
                        default:
                            b0.a(zVar2, lbVar2, jVar2, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            return;
                    }
                }
            });
        } else {
            final int i3 = 1;
            r.a(this, MaxDebuggerWaterfallSegmentsActivity.class, jVar.e(), new r.b() { // from class: com.applovin.impl.ps
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    int i32 = i3;
                    lb lbVar2 = lbVar;
                    z zVar2 = zVar;
                    com.applovin.impl.sdk.j jVar2 = jVar;
                    switch (i32) {
                        case 0:
                            b0.a(zVar2, lbVar2, jVar2, (MaxDebuggerAdUnitDetailActivity) activity);
                            return;
                        default:
                            b0.a(zVar2, lbVar2, jVar2, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            return;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dc a(String str, String str2) {
        return dc.a(dc.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dc a(List list) {
        return dc.a(dc.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }
}
