package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.plantcare.ai.identifier.plantid.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1633c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1634d;

    /* renamed from: e, reason: collision with root package name */
    public w f1635e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c2 operation, j0.e signal, boolean z10) {
        super(operation, signal);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.f1633c = z10;
    }

    public final w c(Context context) {
        boolean z10;
        int exitAnim;
        Animation loadAnimation;
        w wVar;
        w wVar2;
        int i10;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f1634d) {
            return this.f1635e;
        }
        c2 c2Var = this.a;
        Fragment fragment = c2Var.f1596c;
        boolean z11 = false;
        if (c2Var.a == b2.VISIBLE) {
            z10 = true;
        } else {
            z10 = false;
        }
        int nextTransition = fragment.getNextTransition();
        if (this.f1633c) {
            if (z10) {
                exitAnim = fragment.getPopEnterAnim();
            } else {
                exitAnim = fragment.getPopExitAnim();
            }
        } else if (z10) {
            exitAnim = fragment.getEnterAnim();
        } else {
            exitAnim = fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, exitAnim);
            if (onCreateAnimation != null) {
                wVar2 = new w(onCreateAnimation);
            } else {
                Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, exitAnim);
                if (onCreateAnimator != null) {
                    wVar2 = new w(onCreateAnimator);
                } else {
                    if (exitAnim == 0 && nextTransition != 0) {
                        if (nextTransition != 4097) {
                            if (nextTransition != 8194) {
                                if (nextTransition != 8197) {
                                    if (nextTransition != 4099) {
                                        if (nextTransition != 4100) {
                                            i10 = -1;
                                        } else if (z10) {
                                            i10 = com.facebook.internal.i.I(context, android.R.attr.activityOpenEnterAnimation);
                                        } else {
                                            i10 = com.facebook.internal.i.I(context, android.R.attr.activityOpenExitAnimation);
                                        }
                                    } else if (z10) {
                                        i10 = R.animator.fragment_fade_enter;
                                    } else {
                                        i10 = R.animator.fragment_fade_exit;
                                    }
                                } else if (z10) {
                                    i10 = com.facebook.internal.i.I(context, android.R.attr.activityCloseEnterAnimation);
                                } else {
                                    i10 = com.facebook.internal.i.I(context, android.R.attr.activityCloseExitAnimation);
                                }
                            } else if (z10) {
                                i10 = R.animator.fragment_close_enter;
                            } else {
                                i10 = R.animator.fragment_close_exit;
                            }
                        } else if (z10) {
                            i10 = R.animator.fragment_open_enter;
                        } else {
                            i10 = R.animator.fragment_open_exit;
                        }
                        exitAnim = i10;
                    }
                    if (exitAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                        if (equals) {
                            try {
                                loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                            } catch (Resources.NotFoundException e2) {
                                throw e2;
                            } catch (RuntimeException unused) {
                            }
                            if (loadAnimation != null) {
                                wVar = new w(loadAnimation);
                                wVar2 = wVar;
                            } else {
                                z11 = true;
                            }
                        }
                        if (!z11) {
                            try {
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                                if (loadAnimator != null) {
                                    wVar = new w(loadAnimator);
                                    wVar2 = wVar;
                                }
                            } catch (RuntimeException e10) {
                                if (!equals) {
                                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                    if (loadAnimation2 != null) {
                                        wVar2 = new w(loadAnimation2);
                                    }
                                } else {
                                    throw e10;
                                }
                            }
                        }
                    }
                }
            }
            this.f1635e = wVar2;
            this.f1634d = true;
            return wVar2;
        }
        wVar2 = null;
        this.f1635e = wVar2;
        this.f1634d = true;
        return wVar2;
    }
}
