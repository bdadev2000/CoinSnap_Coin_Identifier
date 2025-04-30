package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.module.a.a;
import com.mbridge.msdk.video.module.a.a.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* renamed from: a, reason: collision with root package name */
    protected Context f18768a;
    protected CampaignEx b;

    /* renamed from: c, reason: collision with root package name */
    protected LayoutInflater f18769c;

    /* renamed from: d, reason: collision with root package name */
    protected int f18770d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f18771e;

    /* renamed from: f, reason: collision with root package name */
    protected float f18772f;

    /* renamed from: g, reason: collision with root package name */
    protected float f18773g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f18774h;

    /* renamed from: i, reason: collision with root package name */
    protected int f18775i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f18776j;

    /* renamed from: k, reason: collision with root package name */
    protected int f18777k;
    protected int l;
    public a notifyListener;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    public final JSONObject a(int i9) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15682h, ai.b(c.m().c(), this.f18772f));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15683i, ai.b(c.m().c(), this.f18773g));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.m, i9);
                try {
                    this.f18770d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15685k, this.f18770d);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.l, ai.d(getContext()));
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

    public void c() {
    }

    public final String d() {
        return a(0).toString();
    }

    public void defaultShow() {
        ad.a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z8, String str) {
        if (z8) {
            return findDyID(str);
        }
        return findID(str);
    }

    public int findColor(String str) {
        return v.a(this.f18768a.getApplicationContext(), str, TtmlNode.ATTR_TTS_COLOR);
    }

    public int findDrawable(String str) {
        return v.a(this.f18768a.getApplicationContext(), str, "drawable");
    }

    public int findDyID(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    public int findID(String str) {
        return v.a(this.f18768a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(this.f18768a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.b;
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

    public abstract void init(Context context);

    public boolean isLandscape() {
        if (this.f18768a.getResources().getConfiguration().orientation == 2) {
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
        this.f18770d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f18772f = motionEvent.getRawX();
        this.f18773g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f18770d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public void setLayoutCenter(int i9, int i10) {
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
        }
    }

    public void setLayoutParam(int i9, int i10, int i11, int i12) {
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

    public void setNotifyListener(a aVar) {
        this.notifyListener = aVar;
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

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z8, int i9, boolean z9, int i10, int i11) {
        super(context, attributeSet);
        this.f18770d = 1;
        this.notifyListener = new f();
        this.f18771e = false;
        this.f18777k = 1;
        this.l = 0;
        this.f18768a = context;
        this.f18769c = LayoutInflater.from(context);
        this.f18774h = z8;
        this.f18775i = i9;
        this.f18776j = z9;
        this.f18777k = i10;
        this.l = i11;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18770d = 1;
        this.notifyListener = new f();
        this.f18771e = false;
        this.f18777k = 1;
        this.l = 0;
        this.f18768a = context;
        this.f18769c = LayoutInflater.from(context);
        init(context);
    }
}
