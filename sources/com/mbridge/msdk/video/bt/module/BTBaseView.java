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

/* loaded from: classes3.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* renamed from: n, reason: collision with root package name */
    protected static int f18365n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected static int f18366o = 1;

    /* renamed from: a, reason: collision with root package name */
    protected Context f18367a;
    protected CampaignEx b;

    /* renamed from: c, reason: collision with root package name */
    protected String f18368c;

    /* renamed from: d, reason: collision with root package name */
    protected String f18369d;

    /* renamed from: e, reason: collision with root package name */
    protected c f18370e;

    /* renamed from: f, reason: collision with root package name */
    protected LayoutInflater f18371f;

    /* renamed from: g, reason: collision with root package name */
    protected int f18372g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f18373h;

    /* renamed from: i, reason: collision with root package name */
    protected float f18374i;

    /* renamed from: j, reason: collision with root package name */
    protected float f18375j;

    /* renamed from: k, reason: collision with root package name */
    protected Rect f18376k;
    protected int l;
    protected int m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public void a() {
    }

    public void defaultShow() {
        ad.a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return v.a(this.f18367a.getApplicationContext(), str, TtmlNode.ATTR_TTS_COLOR);
    }

    public int findDrawable(String str) {
        return v.a(this.f18367a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return v.a(this.f18367a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(this.f18367a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.b;
    }

    public String getInstanceId() {
        return this.f18369d;
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
        return this.f18376k;
    }

    public String getUnitId() {
        return this.f18368c;
    }

    public int getViewHeight() {
        return this.m;
    }

    public int getViewWidth() {
        return this.l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        if (this.f18367a.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i9 = 0;
        boolean z8 = false;
        while (i9 < length) {
            if (viewArr[i9] == null) {
                return false;
            }
            i9++;
            z8 = true;
        }
        return z8;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f18372g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f18374i = motionEvent.getRawX();
        this.f18375j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f18372g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f18369d = str;
    }

    public void setLayout(int i9, int i10) {
        this.l = i9;
        this.m = i10;
    }

    public void setLayoutCenter(int i9, int i10) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i9 != -999) {
                parentRelativeLayoutParams.width = i9;
            }
            if (i10 != -999) {
                parentRelativeLayoutParams.height = i10;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i9 != -999) {
                parentLinearLayoutParams.width = i9;
            }
            if (i10 != -999) {
                parentLinearLayoutParams.height = i10;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i9 != -999) {
                parentFrameLayoutParams.width = i9;
            }
            if (i10 != -999) {
                parentFrameLayoutParams.height = i10;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i9, int i10, int i11, int i12) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i10;
            parentRelativeLayoutParams.leftMargin = i9;
            if (i11 != -999) {
                parentRelativeLayoutParams.width = i11;
            }
            if (i12 != -999) {
                parentRelativeLayoutParams.height = i12;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i10;
            parentLinearLayoutParams.leftMargin = i9;
            if (i11 != -999) {
                parentLinearLayoutParams.width = i11;
            }
            if (i12 != -999) {
                parentLinearLayoutParams.height = i12;
            }
            setLayoutParams(parentLinearLayoutParams);
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i10;
            parentFrameLayoutParams.leftMargin = i9;
            if (i11 != -999) {
                parentFrameLayoutParams.width = i11;
            }
            if (i12 != -999) {
                parentFrameLayoutParams.height = i12;
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
        this.f18376k = rect;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f18370e = cVar;
    }

    public void setUnitId(String str) {
        this.f18368c = str;
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
        this.f18369d = "";
        this.f18372g = 1;
        this.f18373h = false;
        this.f18367a = context;
        this.f18371f = LayoutInflater.from(context);
        init(context);
    }

    public final JSONObject a(int i9) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(a.f15682h, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f18374i));
                jSONObject2.put(a.f15683i, ai.b(com.mbridge.msdk.foundation.controller.c.m().c(), this.f18375j));
                jSONObject2.put(a.m, i9);
                try {
                    this.f18372g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                jSONObject2.put(a.f15685k, this.f18372g);
                jSONObject2.put(a.l, ai.d(getContext()));
                return jSONObject2;
            } catch (JSONException e9) {
                e = e9;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e10) {
            e = e10;
        }
    }

    public static void a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f18365n);
            jSONObject.put("id", str2);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, new JSONObject());
            g.a().a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            d.c().a(webView, e4.getMessage());
            ad.a(TAG, e4.getMessage());
        }
    }
}
