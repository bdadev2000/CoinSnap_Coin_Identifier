package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.bt.a.d;
import com.mbridge.msdk.videocommon.d.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n, reason: collision with root package name */
    protected static int f15598n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected static int f15599o = 1;
    protected Context a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f15600b;

    /* renamed from: c, reason: collision with root package name */
    protected String f15601c;

    /* renamed from: d, reason: collision with root package name */
    protected String f15602d;

    /* renamed from: e, reason: collision with root package name */
    protected c f15603e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f15604f;

    /* renamed from: g, reason: collision with root package name */
    protected int f15605g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f15606h;

    /* renamed from: i, reason: collision with root package name */
    protected float f15607i;

    /* renamed from: j, reason: collision with root package name */
    protected float f15608j;

    /* renamed from: k, reason: collision with root package name */
    protected Rect f15609k;

    /* renamed from: l, reason: collision with root package name */
    protected int f15610l;

    /* renamed from: m, reason: collision with root package name */
    protected int f15611m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public void a() {
    }

    public void defaultShow() {
        ad.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return v.a(this.a.getApplicationContext(), str, TtmlNode.ATTR_TTS_COLOR);
    }

    public int findDrawable(String str) {
        return v.a(this.a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return v.a(this.a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(this.a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f15600b;
    }

    public String getInstanceId() {
        return this.f15602d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public Rect getRect() {
        return this.f15609k;
    }

    public String getUnitId() {
        return this.f15601c;
    }

    public int getViewHeight() {
        return this.f15611m;
    }

    public int getViewWidth() {
        return this.f15610l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (viewArr[i10] == null) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f15605g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f15607i = motionEvent.getRawX();
        this.f15608j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f15605g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f15600b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f15602d = str;
    }

    public void setLayout(int i10, int i11) {
        this.f15610l = i10;
        this.f15611m = i11;
    }

    public void setLayoutCenter(int i10, int i11) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentFrameLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentFrameLayoutParams.height = i11;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i11;
            parentRelativeLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentRelativeLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentRelativeLayoutParams.height = i13;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i11;
            parentLinearLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentLinearLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentLinearLayoutParams.height = i13;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i11;
            parentFrameLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentFrameLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentFrameLayoutParams.height = i13;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setRect(Rect rect) {
        this.f15609k = rect;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f15603e = cVar;
    }

    public void setUnitId(String str) {
        this.f15601c = str;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15602d = "";
        this.f15605g = 1;
        this.f15606h = false;
        this.a = context;
        this.f15604f = LayoutInflater.from(context);
        init(context);
    }

    public final JSONObject a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.f13277h, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15607i));
                jSONObject2.put(a.f13278i, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f15608j));
                jSONObject2.put(a.f13282m, i10);
                try {
                    this.f15605g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                jSONObject2.put(a.f13280k, this.f15605g);
                jSONObject2.put(a.f13281l, ai.d(getContext()));
                return jSONObject2;
            } catch (JSONException e10) {
                e = e10;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e11) {
            e = e11;
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f15598n);
            jSONObject.put("id", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            d.c().a(webView, e2.getMessage());
            ad.a(TAG, e2.getMessage());
        }
    }
}
