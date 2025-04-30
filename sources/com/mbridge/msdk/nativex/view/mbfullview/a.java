package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.same.c.c;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.d;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class a {
    private static volatile a b;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f16849a;

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16852a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            f16852a = iArr;
            try {
                iArr[BaseView.a.FULL_TOP_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16852a[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0171a implements c {
        private WeakReference<MBridgeTopFullView> b;

        public C0171a(MBridgeTopFullView mBridgeTopFullView) {
            this.b = new WeakReference<>(mBridgeTopFullView);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            WeakReference<MBridgeTopFullView> weakReference = this.b;
            if (weakReference != null && weakReference.get() != null) {
                this.b.get().getMBridgeFullViewDisplayIcon().setImageBitmap(a.a(a.this, bitmap, 25));
            }
        }
    }

    private a(Context context) {
        this.f16849a = new WeakReference<>(context);
    }

    public static a a(Context context) {
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        b = new a(context);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final void a(BaseView.a aVar, CampaignEx campaignEx, BaseView baseView) {
        int i9 = AnonymousClass2.f16852a[aVar.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                return;
            }
            baseView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            return;
        }
        MBridgeTopFullView mBridgeTopFullView = (MBridgeTopFullView) baseView;
        if (mBridgeTopFullView != null) {
            Context context = this.f16849a.get();
            if (context != null) {
                b.a(context).a(campaignEx.getIconUrl(), new C0171a(mBridgeTopFullView));
            }
            mBridgeTopFullView.getMBridgeFullViewDisplayTitle().setText(campaignEx.getAppName());
            mBridgeTopFullView.getMBridgeFullViewDisplayDscription().setText(campaignEx.getAppDesc());
            mBridgeTopFullView.getMBridgeFullTvInstall().setText(campaignEx.getAdCall());
            mBridgeTopFullView.getStarLevelLayoutView().setRating((int) campaignEx.getRating());
        }
    }

    public final void a(boolean z8, BaseView baseView, int i9) {
        RelativeLayout.LayoutParams layoutParams;
        int a6;
        Context context = this.f16849a.get();
        if (context != null) {
            if (z8) {
                layoutParams = new RelativeLayout.LayoutParams((int) (a(z8) / 3.0f), ai.a(context, 45.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = ai.a(context, 10.0f);
                if (d.a(context) && i9 == 0) {
                    a6 = ai.a(context, 8.0f) + ai.c(context);
                } else {
                    a6 = ai.a(context, 8.0f);
                }
                layoutParams.rightMargin = a6;
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, ai.a(context, 45.0f));
                layoutParams.addRule(12);
            }
            baseView.getmAnimationContent().setLayoutParams(layoutParams);
        }
    }

    private float a(boolean z8) {
        try {
            Context context = this.f16849a.get();
            if (context == null) {
                return 0.0f;
            }
            float h6 = ai.h(context);
            return z8 ? h6 + ai.c(context) : h6;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public final void a(final boolean z8, boolean z9, final BaseView baseView) {
        int parseColor = Color.parseColor("#ff264870");
        baseView.getmAnimationPlayer().setBackgroundColor(parseColor);
        Context context = this.f16849a.get();
        if (!z8) {
            if (baseView.style != BaseView.a.FULL_MIDDLE_VIEW) {
                if (context != null) {
                    baseView.getmAnimationContent().setBackgroundResource(v.a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    baseView.getmAnimationPlayer().setBackgroundResource(v.a(context, "mbridge_nativex_cta_por_pre", "drawable"));
                    return;
                }
                return;
            }
        } else {
            if (baseView.style == BaseView.a.FULL_TOP_VIEW && context != null) {
                baseView.getmAnimationContent().setBackgroundResource(v.a(context, "mbridge_nativex_fullview_background", "drawable"));
                baseView.getmAnimationPlayer().setBackgroundColor(parseColor);
            }
            if (z9) {
                baseView.getmAnimationPlayer().getBackground().setAlpha(80);
            } else {
                baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
                baseView.getmAnimationPlayer().getBackground().setAlpha(200);
            }
        }
        if (z9) {
            new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.nativex.view.mbfullview.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    int i9;
                    baseView.getmAnimationPlayer().setBackgroundColor(Color.parseColor("#ff4c8fdf"));
                    Drawable background = baseView.getmAnimationPlayer().getBackground();
                    if (z8) {
                        i9 = 200;
                    } else {
                        i9 = 255;
                    }
                    background.setAlpha(i9);
                    a.a(a.this, baseView.getmAnimationPlayer());
                }
            }, 1000L);
        }
    }

    public final void a(View view, BaseView baseView) {
        if (view == null || baseView == null) {
            return;
        }
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        baseView.f16844i.addView(view);
    }

    public final void a(BaseView baseView, boolean z8) {
        if (baseView != null) {
            baseView.setSystemUiVisibility(z8 ? 0 : 4098);
        }
    }

    public static /* synthetic */ Bitmap a(a aVar, Bitmap bitmap, int i9) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        bitmap.getWidth();
        float f9 = i9;
        canvas.drawRoundRect(rectF, f9, f9, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static /* synthetic */ void a(a aVar, View view) {
        if (view == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatCount(2);
        alphaAnimation.setRepeatMode(1);
        view.startAnimation(alphaAnimation);
    }
}
