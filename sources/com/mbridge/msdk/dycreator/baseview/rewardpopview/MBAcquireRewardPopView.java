package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.MBGradientAndShadowTextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* loaded from: classes4.dex */
public class MBAcquireRewardPopView extends RelativeLayout {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private AcquireRewardPopViewParameters f12832b;

    /* renamed from: c, reason: collision with root package name */
    private AnimationSet f12833c;

    /* renamed from: d, reason: collision with root package name */
    private float f12834d;

    /* renamed from: e, reason: collision with root package name */
    private float f12835e;

    /* renamed from: f, reason: collision with root package name */
    private float f12836f;

    /* renamed from: g, reason: collision with root package name */
    private float f12837g;

    /* renamed from: h, reason: collision with root package name */
    private int f12838h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12839i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12840j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f12841k;

    /* renamed from: l, reason: collision with root package name */
    private final View.OnClickListener f12842l;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f12843m;

    /* renamed from: n, reason: collision with root package name */
    private Runnable f12844n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnTouchListener f12845o;

    /* renamed from: p, reason: collision with root package name */
    private final View.OnClickListener f12846p;

    /* renamed from: q, reason: collision with root package name */
    private final View.OnClickListener f12847q;

    public MBAcquireRewardPopView(Context context) {
        super(context);
        this.a = "MBAcquireRewardPopView";
        this.f12834d = 0.0f;
        this.f12835e = 0.0f;
        this.f12836f = 0.0f;
        this.f12837g = 0.0f;
        this.f12842l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f10;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f12843m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.f12832b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f10 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f10 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f10);
                }
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f12832b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f12844n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.f12843m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f12838h <= 0) {
                    if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f12839i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f12843m, 1000L);
            }
        };
        this.f12844n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f12839i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f12845o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f12836f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f12837g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f12836f > MBAcquireRewardPopView.this.f12834d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f12836f - MBAcquireRewardPopView.this.f12834d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f12837g - MBAcquireRewardPopView.this.f12835e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f12840j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f12843m);
                            MBAcquireRewardPopView.this.f12840j = true;
                            View e2 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e2);
                            }
                            if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f12832b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f12844n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f12834d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f12835e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f12846p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                }
            }
        };
        this.f12847q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f12839i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public static /* synthetic */ View e(MBAcquireRewardPopView mBAcquireRewardPopView) {
        String str;
        LinearLayout linearLayout = new LinearLayout(mBAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = mBAcquireRewardPopView.f12832b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(mBAcquireRewardPopView.getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, ai.a(mBAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = mBAcquireRewardPopView.f12832b;
        int i10 = acquireRewardPopViewParameters2.viewType;
        if (i10 == 1) {
            str = acquireRewardPopViewParameters2.successTitle;
        } else if (i10 == 2) {
            str = acquireRewardPopViewParameters2.slideSuccessTitle;
        } else {
            str = "";
        }
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setText(String.format(" %s ", str));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable a = mBAcquireRewardPopView.a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(mBAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(mBAcquireRewardPopView.f12832b.successTipTextColor);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = mBAcquireRewardPopView.f12832b;
        textView.setText(String.format(acquireRewardPopViewParameters3.successTip, Integer.valueOf(acquireRewardPopViewParameters3.reduceTime)));
        int a10 = ai.a(mBAcquireRewardPopView.getContext(), 6.0f);
        int a11 = ai.a(mBAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(a11, a10, a11, a10);
        textView.setBackground(a);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ View f(MBAcquireRewardPopView mBAcquireRewardPopView) {
        LinearLayout linearLayout = new LinearLayout(mBAcquireRewardPopView.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = mBAcquireRewardPopView.f12832b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.failTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.failTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.failTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(mBAcquireRewardPopView.getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, ai.a(mBAcquireRewardPopView.getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(String.format(" %s ", mBAcquireRewardPopView.f12832b.failTitle));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable a = mBAcquireRewardPopView.a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(mBAcquireRewardPopView.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(mBAcquireRewardPopView.f12832b.failTipTextColor);
        textView.setText(String.format(mBAcquireRewardPopView.f12832b.failTip, ""));
        int a10 = ai.a(mBAcquireRewardPopView.getContext(), 6.0f);
        int a11 = ai.a(mBAcquireRewardPopView.getContext(), 32.0f);
        textView.setPadding(a11, a10, a11, a10);
        textView.setBackground(a);
        linearLayout.addView(textView);
        return linearLayout;
    }

    public static /* synthetic */ int i(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i10 = mBAcquireRewardPopView.f12838h;
        mBAcquireRewardPopView.f12838h = i10 - 1;
        return i10;
    }

    public void init(AcquireRewardPopViewParameters acquireRewardPopViewParameters) {
        View view;
        if (acquireRewardPopViewParameters == null) {
            ad.b("MBAcquireRewardPopView", "Must generate parameters.");
            return;
        }
        this.f12832b = acquireRewardPopViewParameters;
        if (acquireRewardPopViewParameters.viewType == 1) {
            ArrayList<String> arrayList = new ArrayList<>();
            AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f12832b;
            if (acquireRewardPopViewParameters2 != null) {
                List<String> list = acquireRewardPopViewParameters2.rightAnswerList;
                if (list != null) {
                    arrayList.addAll(list);
                }
                if (this.f12832b.wrongAnswerList != null) {
                    int nextInt = new Random().nextInt(this.f12832b.wrongAnswerList.size());
                    if (nextInt > this.f12832b.wrongAnswerList.size() - 1) {
                        nextInt = 0;
                    }
                    arrayList.add(this.f12832b.wrongAnswerList.get(nextInt));
                }
            }
            view = a(arrayList);
            if (this.f12832b.canClickMaskArea) {
                setOnClickListener(this.f12846p);
            }
        } else {
            view = null;
        }
        if (this.f12832b.viewType == 2) {
            int a = ai.a(getContext(), 290.0f);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setOrientation(1);
            MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
            AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.f12832b;
            gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters3.successTitleGradientStartColor;
            gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters3.successTitleGradientEndColor;
            gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters3.successTitleShadowColor;
            gradientAndShadowParameters.textSize = 30;
            MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(0, 0, 0, ai.a(getContext(), 12.0f));
            layoutParams2.gravity = 1;
            mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
            mBGradientAndShadowTextView.setText(String.format(" %s ", this.f12832b.slideTitle));
            mBGradientAndShadowTextView.setGravity(17);
            linearLayout.addView(mBGradientAndShadowTextView);
            GradientDrawable a10 = a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
            this.f12841k = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 1;
            layoutParams3.setMargins(0, 0, 0, ai.a(getContext(), 25.0f));
            this.f12841k.setLayoutParams(layoutParams3);
            this.f12841k.setTextSize(12.0f);
            this.f12841k.setGravity(17);
            this.f12841k.setTextColor(this.f12832b.successTipTextColor);
            TextView textView = this.f12841k;
            AcquireRewardPopViewParameters acquireRewardPopViewParameters4 = this.f12832b;
            textView.setText(String.format(acquireRewardPopViewParameters4.slideTip, Integer.valueOf(acquireRewardPopViewParameters4.reduceTime)));
            int a11 = ai.a(getContext(), 6.0f);
            int a12 = ai.a(getContext(), 32.0f);
            this.f12841k.setPadding(a12, a11, a12, a11);
            this.f12841k.setBackground(a10);
            linearLayout.addView(this.f12841k);
            View imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            imageView.setLayoutParams(layoutParams4);
            imageView.setBackgroundResource(getResources().getIdentifier("mbridge_slide_rightarrow", "drawable", c.m().g()));
            linearLayout.addView(imageView);
            View imageView2 = new ImageView(getContext());
            imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            imageView2.setBackgroundResource(getResources().getIdentifier("mbridge_slide_hand", "drawable", c.m().g()));
            linearLayout.addView(imageView2);
            imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    if (MBAcquireRewardPopView.this.f12833c != null) {
                        MBAcquireRewardPopView.this.f12833c.cancel();
                    }
                }
            });
            linearLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.2
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    MBAcquireRewardPopView.this.setLongClickable(true);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.setOnTouchListener(mBAcquireRewardPopView.f12845o);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
            view = linearLayout;
        }
        if (view != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.f12832b.containerBackgroundColor);
            addView(view);
            int i10 = this.f12832b.autoDismissTime;
            if (i10 > 0) {
                this.f12838h = i10;
                post(this.f12843m);
                this.f12839i = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f12843m);
    }

    public void onPause() {
        if (this.f12839i && this.f12838h > 0) {
            removeCallbacks(this.f12843m);
        }
    }

    public void onResume() {
        if (this.f12839i && this.f12838h > 0) {
            post(this.f12843m);
        }
    }

    public void onStop() {
        if (this.f12839i && this.f12838h > 0) {
            removeCallbacks(this.f12843m);
        }
    }

    public void onTimeLessThanReduce(int i10) {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f12832b;
        acquireRewardPopViewParameters.reduceTime = i10;
        TextView textView = this.f12841k;
        if (textView != null) {
            textView.setText(String.format(acquireRewardPopViewParameters.tips, Integer.valueOf(i10)));
        }
    }

    private View a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ai.a(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f12832b;
        int i10 = acquireRewardPopViewParameters.viewBackLayerTopColor;
        int i11 = acquireRewardPopViewParameters.viewBackLayerBottomColor;
        int i12 = acquireRewardPopViewParameters.viewForegroundTopColor;
        int i13 = acquireRewardPopViewParameters.viewForegroundBottomColor;
        GradientDrawable a = a(new int[]{i10, i11}, GradientDrawable.Orientation.TOP_BOTTOM);
        a.setCornerRadius(ai.a(getContext(), 12.0f));
        GradientDrawable a10 = a(new int[]{i12, i13}, GradientDrawable.Orientation.TOP_BOTTOM);
        a10.setCornerRadius(ai.a(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a, a10});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        linearLayout.setBackground(layerDrawable);
        ImageView imageView = new ImageView(getContext());
        int a11 = ai.a(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a11, a11);
        layoutParams2.gravity = 8388613;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("mbridge_reward_popview_close", "drawable", c.m().g()));
        imageView.setOnClickListener(this.f12847q);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int a12 = ai.a(getContext(), 18.0f);
        layoutParams3.setMargins(a12, 5, a12, ai.a(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.f12832b.title);
        textView.setTextColor(this.f12832b.titleTextColor);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList != null && arrayList.size() > 1) {
            int a13 = ai.a(getContext(), 8.0f);
            int a14 = ai.a(getContext(), 24.0f);
            int a15 = ai.a(getContext(), 30.0f);
            int a16 = ai.a(getContext(), 12.0f);
            int a17 = ai.a(getContext(), 40.0f);
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                boolean contains = this.f12832b.rightAnswerList.contains(arrayList.get(i14));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(a15, a16, a15, 0);
                textView2.setPadding(a14, a13, a14, a13);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i14));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i14));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f12832b;
                textView2.setTextColor(contains ? acquireRewardPopViewParameters2.buttonTextLightColor : acquireRewardPopViewParameters2.buttonTextDarkColor);
                AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.f12832b;
                int i15 = contains ? acquireRewardPopViewParameters3.buttonBackgroundLightColor : acquireRewardPopViewParameters3.buttonBackgroundDarkColor;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i15);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(a17);
                textView2.setBackground(gradientDrawable);
                textView2.setOnClickListener(this.f12842l);
                linearLayout.addView(textView2);
            }
        }
        this.f12841k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int a18 = ai.a(getContext(), 16.0f);
        int a19 = ai.a(getContext(), 18.0f);
        layoutParams5.setMargins(a19, a18, a19, a18);
        layoutParams5.gravity = 1;
        this.f12841k.setLayoutParams(layoutParams5);
        TextView textView3 = this.f12841k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters4 = this.f12832b;
        textView3.setText(String.format(acquireRewardPopViewParameters4.tips, Integer.valueOf(acquireRewardPopViewParameters4.reduceTime)));
        this.f12841k.setTextColor(this.f12832b.tipTextColor);
        this.f12841k.setGravity(17);
        this.f12841k.setTextSize(12.0f);
        linearLayout.addView(this.f12841k);
        return linearLayout;
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = "MBAcquireRewardPopView";
        this.f12834d = 0.0f;
        this.f12835e = 0.0f;
        this.f12836f = 0.0f;
        this.f12837g = 0.0f;
        this.f12842l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f10;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f12843m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.f12832b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f10 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f10 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f10);
                }
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f12832b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f12844n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.f12843m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f12838h <= 0) {
                    if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f12839i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f12843m, 1000L);
            }
        };
        this.f12844n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f12839i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f12845o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f12836f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f12837g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f12836f > MBAcquireRewardPopView.this.f12834d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f12836f - MBAcquireRewardPopView.this.f12834d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f12837g - MBAcquireRewardPopView.this.f12835e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f12840j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f12843m);
                            MBAcquireRewardPopView.this.f12840j = true;
                            View e2 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e2);
                            }
                            if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f12832b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f12844n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f12834d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f12835e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f12846p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                }
            }
        };
        this.f12847q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f12839i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.a = "MBAcquireRewardPopView";
        this.f12834d = 0.0f;
        this.f12835e = 0.0f;
        this.f12836f = 0.0f;
        this.f12837g = 0.0f;
        this.f12842l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f10;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f12843m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.f12832b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f10 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f10 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f10);
                }
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f12832b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f12844n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.f12843m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f12838h <= 0) {
                    if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f12839i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f12843m, 1000L);
            }
        };
        this.f12844n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f12839i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f12845o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f12836f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f12837g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f12836f > MBAcquireRewardPopView.this.f12834d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f12836f - MBAcquireRewardPopView.this.f12834d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f12837g - MBAcquireRewardPopView.this.f12835e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f12840j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f12843m);
                            MBAcquireRewardPopView.this.f12840j = true;
                            View e2 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e2);
                            }
                            if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f12832b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f12844n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f12834d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f12835e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f12846p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                }
            }
        };
        this.f12847q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f12839i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.a = "MBAcquireRewardPopView";
        this.f12834d = 0.0f;
        this.f12835e = 0.0f;
        this.f12836f = 0.0f;
        this.f12837g = 0.0f;
        this.f12842l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                View f10;
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f12843m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean contains = MBAcquireRewardPopView.this.f12832b.rightAnswerList.contains(str);
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                if (contains) {
                    f10 = MBAcquireRewardPopView.e(mBAcquireRewardPopView2);
                } else {
                    f10 = MBAcquireRewardPopView.f(mBAcquireRewardPopView2);
                }
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, f10);
                }
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    if (contains) {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f12832b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView3 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView3.postDelayed(mBAcquireRewardPopView3.f12844n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        };
        this.f12843m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f12838h <= 0) {
                    if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f12839i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                    return;
                }
                MBAcquireRewardPopView.i(MBAcquireRewardPopView.this);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f12843m, 1000L);
            }
        };
        this.f12844n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f12839i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f12845o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            MBAcquireRewardPopView.this.f12836f = motionEvent.getX();
                            MBAcquireRewardPopView.this.f12837g = motionEvent.getY();
                        }
                    } else if (MBAcquireRewardPopView.this.f12836f > MBAcquireRewardPopView.this.f12834d) {
                        if (Math.abs(MBAcquireRewardPopView.this.f12836f - MBAcquireRewardPopView.this.f12834d) > 50.0f && Math.abs(MBAcquireRewardPopView.this.f12837g - MBAcquireRewardPopView.this.f12835e) < 100.0f) {
                            if (MBAcquireRewardPopView.this.f12840j) {
                                return false;
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f12843m);
                            MBAcquireRewardPopView.this.f12840j = true;
                            View e2 = MBAcquireRewardPopView.e(MBAcquireRewardPopView.this);
                            View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                            if (childAt != null) {
                                MBAcquireRewardPopView.a(MBAcquireRewardPopView.this, childAt, e2);
                            }
                            if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                                MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f12832b.reduceTime);
                            }
                            MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                            mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f12844n, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                        } else {
                            MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                        }
                    } else {
                        MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                    }
                } else {
                    MBAcquireRewardPopView.this.f12834d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f12835e = motionEvent.getY();
                }
                return false;
            }
        };
        this.f12846p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f12832b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f12834d, MBAcquireRewardPopView.this.f12835e);
                }
            }
        };
        this.f12847q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f12832b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f12832b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f12839i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    private GradientDrawable a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    public static /* synthetic */ void a(MBAcquireRewardPopView mBAcquireRewardPopView, final View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        mBAcquireRewardPopView.f12833c = animationSet;
        animationSet.addAnimation(translateAnimation);
        mBAcquireRewardPopView.f12833c.addAnimation(alphaAnimation);
        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(MBAcquireRewardPopView.this.f12833c);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        mBAcquireRewardPopView.f12833c.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(alphaAnimation2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(mBAcquireRewardPopView.f12833c);
    }

    public static /* synthetic */ void a(MBAcquireRewardPopView mBAcquireRewardPopView, View view, View view2) {
        mBAcquireRewardPopView.removeView(view);
        mBAcquireRewardPopView.addView(view2);
    }
}
