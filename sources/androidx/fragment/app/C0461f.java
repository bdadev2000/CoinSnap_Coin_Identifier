package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461f extends AbstractC0471k {
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4717c;

    /* renamed from: d, reason: collision with root package name */
    public L f4718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0461f(L0 l02, boolean z8) {
        super(l02);
        G7.j.e(l02, "operation");
        this.b = z8;
    }

    public final L b(Context context) {
        boolean z8;
        int exitAnim;
        Animation loadAnimation;
        L l;
        L l2;
        int i9;
        if (this.f4717c) {
            return this.f4718d;
        }
        L0 l02 = this.f4731a;
        Fragment fragment = l02.f4667c;
        if (l02.f4666a == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        int nextTransition = fragment.getNextTransition();
        if (this.b) {
            if (z8) {
                exitAnim = fragment.getPopEnterAnim();
            } else {
                exitAnim = fragment.getPopExitAnim();
            }
        } else if (z8) {
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
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z8, exitAnim);
            if (onCreateAnimation != null) {
                l2 = new L(onCreateAnimation);
            } else {
                Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z8, exitAnim);
                if (onCreateAnimator != null) {
                    l2 = new L(onCreateAnimator);
                } else {
                    if (exitAnim == 0 && nextTransition != 0) {
                        if (nextTransition != 4097) {
                            if (nextTransition != 8194) {
                                if (nextTransition != 8197) {
                                    if (nextTransition != 4099) {
                                        if (nextTransition != 4100) {
                                            i9 = -1;
                                        } else if (z8) {
                                            i9 = com.bumptech.glide.c.T(context, android.R.attr.activityOpenEnterAnimation);
                                        } else {
                                            i9 = com.bumptech.glide.c.T(context, android.R.attr.activityOpenExitAnimation);
                                        }
                                    } else if (z8) {
                                        i9 = R.animator.fragment_fade_enter;
                                    } else {
                                        i9 = R.animator.fragment_fade_exit;
                                    }
                                } else if (z8) {
                                    i9 = com.bumptech.glide.c.T(context, android.R.attr.activityCloseEnterAnimation);
                                } else {
                                    i9 = com.bumptech.glide.c.T(context, android.R.attr.activityCloseExitAnimation);
                                }
                            } else if (z8) {
                                i9 = R.animator.fragment_close_enter;
                            } else {
                                i9 = R.animator.fragment_close_exit;
                            }
                        } else if (z8) {
                            i9 = R.animator.fragment_open_enter;
                        } else {
                            i9 = R.animator.fragment_open_exit;
                        }
                        exitAnim = i9;
                    }
                    if (exitAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                                } catch (Resources.NotFoundException e4) {
                                    throw e4;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    l = new L(loadAnimation);
                                    l2 = l;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                            if (loadAnimator != null) {
                                l = new L(loadAnimator);
                                l2 = l;
                            }
                        } catch (RuntimeException e9) {
                            if (!equals) {
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                if (loadAnimation2 != null) {
                                    l2 = new L(loadAnimation2);
                                }
                            } else {
                                throw e9;
                            }
                        }
                    }
                }
            }
            this.f4718d = l2;
            this.f4717c = true;
            return l2;
        }
        l2 = null;
        this.f4718d = l2;
        this.f4717c = true;
        return l2;
    }
}
