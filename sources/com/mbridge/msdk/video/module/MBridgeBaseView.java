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

/* loaded from: classes4.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";
    protected Context a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f15895b;

    /* renamed from: c, reason: collision with root package name */
    protected LayoutInflater f15896c;

    /* renamed from: d, reason: collision with root package name */
    protected int f15897d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f15898e;

    /* renamed from: f, reason: collision with root package name */
    protected float f15899f;

    /* renamed from: g, reason: collision with root package name */
    protected float f15900g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f15901h;

    /* renamed from: i, reason: collision with root package name */
    protected int f15902i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f15903j;

    /* renamed from: k, reason: collision with root package name */
    protected int f15904k;

    /* renamed from: l, reason: collision with root package name */
    protected int f15905l;
    public a notifyListener;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    public final JSONObject a(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13277h, ai.b(c.m().c(), this.f15899f));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13278i, ai.b(c.m().c(), this.f15900g));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13282m, i10);
                try {
                    this.f15897d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13280k, this.f15897d);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f13281l, ai.d(getContext()));
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

    public void c() {
    }

    public final String d() {
        return a(0).toString();
    }

    public void defaultShow() {
        ad.a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z10, String str) {
        if (z10) {
            return findDyID(str);
        }
        return findID(str);
    }

    public int findColor(String str) {
        return v.a(this.a.getApplicationContext(), str, TtmlNode.ATTR_TTS_COLOR);
    }

    public int findDrawable(String str) {
        return v.a(this.a.getApplicationContext(), str, "drawable");
    }

    public int findDyID(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }

    public int findID(String str) {
        return v.a(this.a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return v.a(this.a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f15895b;
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
        this.f15897d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f15899f = motionEvent.getRawX();
        this.f15900g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f15897d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f15895b = campaignEx;
    }

    public void setLayoutCenter(int i10, int i11) {
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
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
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

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet);
        this.f15897d = 1;
        this.notifyListener = new f();
        this.f15898e = false;
        this.f15904k = 1;
        this.f15905l = 0;
        this.a = context;
        this.f15896c = LayoutInflater.from(context);
        this.f15901h = z10;
        this.f15902i = i10;
        this.f15903j = z11;
        this.f15904k = i11;
        this.f15905l = i12;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15897d = 1;
        this.notifyListener = new f();
        this.f15898e = false;
        this.f15904k = 1;
        this.f15905l = 0;
        this.a = context;
        this.f15896c = LayoutInflater.from(context);
        init(context);
    }
}
