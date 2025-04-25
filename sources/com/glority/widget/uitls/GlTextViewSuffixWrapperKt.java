package com.glority.widget.uitls;

import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import com.glority.android.cmsui2.common.CmsUILogEvents;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: GlTextViewSuffixWrapper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001as\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0002\u001aÕ\u0001\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132%\b\u0002\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00152M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u001a(\u0010\u0017\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u001a(\u0010\u0018\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007\u001a»\u0001\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u00152#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u00152M\u0010\u0007\u001aI\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b¨\u0006\u001b"}, d2 = {"binarySearch", "", "Landroid/widget/TextView;", "mainContent", "", "suffix", "targetLineCount", "textWrapper", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "text", "suffixIndex", CmsUILogEvents.CMS_NAME_TYPE_COLLAPSE, "", "transition", "Landroidx/transition/Transition;", "sceneRoot", "Landroid/view/ViewGroup;", "onSuccess", "Lkotlin/Function1;", "onFailed", "expand", "setTextWithAnimator", "content", "setTextWithSuffix", "mod_release"}, k = 2, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlTextViewSuffixWrapperKt {
    public static final /* synthetic */ int access$binarySearch(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Function3 function3) {
        return binarySearch(textView, charSequence, charSequence2, i, function3);
    }

    public static final void setTextWithAnimator(TextView textView, CharSequence charSequence) {
        setTextWithAnimator$default(textView, charSequence, null, null, 6, null);
    }

    public static final void setTextWithAnimator(TextView textView, CharSequence charSequence, Transition transition) {
        setTextWithAnimator$default(textView, charSequence, transition, null, 4, null);
    }

    public static /* synthetic */ void setTextWithAnimator$default(TextView textView, CharSequence charSequence, Transition transition, ViewGroup viewGroup, int i, Object obj) {
        if ((i & 2) != 0) {
            transition = new AutoTransition();
        }
        if ((i & 4) != 0) {
            ViewParent parent = textView.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            viewGroup = (ViewGroup) parent;
        }
        setTextWithAnimator(textView, charSequence, transition, viewGroup);
    }

    public static final void setTextWithAnimator(final TextView setTextWithAnimator, final CharSequence content, Transition transition, ViewGroup sceneRoot) {
        Intrinsics.checkNotNullParameter(setTextWithAnimator, "$this$setTextWithAnimator");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        CharSequence text = setTextWithAnimator.getText();
        setTextWithAnimator.setText(content);
        Layout layout = setTextWithAnimator.getLayout();
        if (layout != null) {
            int height = layout.getHeight() + setTextWithAnimator.getPaddingTop() + setTextWithAnimator.getPaddingBottom();
            setTextWithAnimator.setText(text);
            setTextWithAnimator.getLayoutParams().height = height;
            setTextWithAnimator.setLayoutParams(setTextWithAnimator.getLayoutParams());
            transition.addListener(new TransitionListenerAdapter() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapperKt$setTextWithAnimator$1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition2) {
                    Intrinsics.checkNotNullParameter(transition2, "transition");
                    transition2.removeListener(this);
                    setTextWithAnimator.getLayoutParams().height = -2;
                    TextView textView = setTextWithAnimator;
                    textView.setLayoutParams(textView.getLayoutParams());
                    setTextWithAnimator.setText(content);
                }

                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition2) {
                    Intrinsics.checkNotNullParameter(transition2, "transition");
                    transition2.removeListener(this);
                }
            });
        }
        TransitionManager.beginDelayedTransition(sceneRoot, transition);
    }

    public static /* synthetic */ void collapse$default(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Transition transition, ViewGroup viewGroup, Function1 function1, Function1 function12, Function3 function3, int i2, Object obj) {
        ViewGroup viewGroup2;
        Function1 function13;
        Function1 function14;
        Transition autoTransition = (i2 & 8) != 0 ? new AutoTransition() : transition;
        if ((i2 & 16) != 0) {
            ViewParent parent = textView.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup2 = viewGroup;
        }
        if ((i2 & 32) != 0) {
            function13 = null;
        } else {
            function13 = function1;
        }
        if ((i2 & 64) != 0) {
            function14 = null;
        } else {
            function14 = function12;
        }
        collapse(textView, charSequence, charSequence2, i, autoTransition, viewGroup2, function13, function14, function3);
    }

    public static final void collapse(final TextView collapse, final CharSequence mainContent, CharSequence suffix, final int i, final Transition transition, final ViewGroup sceneRoot, final Function1<? super CharSequence, Unit> function1, final Function1<? super CharSequence, Unit> function12, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        Intrinsics.checkNotNullParameter(collapse, "$this$collapse");
        Intrinsics.checkNotNullParameter(mainContent, "mainContent");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        final CharSequence text = collapse.getText();
        setTextWithSuffix(collapse, mainContent, suffix, i, new Function1<CharSequence, Unit>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapperKt$collapse$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
                invoke2(charSequence);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final CharSequence result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (transition == null) {
                    Function1 function13 = function1;
                    if (function13 != null) {
                        return;
                    }
                    return;
                }
                final CharSequence text2 = collapse.getText();
                Layout layout = collapse.getLayout();
                Intrinsics.checkNotNullExpressionValue(layout, "layout");
                int height = layout.getHeight() + collapse.getPaddingTop() + collapse.getPaddingBottom();
                collapse.setText(text);
                collapse.getLayoutParams().height = height;
                TextView textView = collapse;
                textView.setLayoutParams(textView.getLayoutParams());
                transition.addListener(new TransitionListenerAdapter() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapperKt$collapse$1.1
                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition2) {
                        Intrinsics.checkNotNullParameter(transition2, "transition");
                        transition2.removeListener(this);
                        collapse.getLayoutParams().height = -2;
                        collapse.setLayoutParams(collapse.getLayoutParams());
                        collapse.setText(text2);
                        Function1 function14 = function1;
                        if (function14 != null) {
                        }
                    }

                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition2) {
                        Intrinsics.checkNotNullParameter(transition2, "transition");
                        transition2.removeListener(this);
                    }
                });
                TransitionManager.beginDelayedTransition(sceneRoot, transition);
            }
        }, new Function1<CharSequence, Unit>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapperKt$collapse$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
                invoke2(charSequence);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                collapse.setText(mainContent);
                collapse.setMaxLines(i);
                Function1 function13 = function12;
                if (function13 != null) {
                }
            }
        }, function3);
    }

    public static /* synthetic */ void expand$default(TextView textView, CharSequence charSequence, Transition transition, ViewGroup viewGroup, int i, Object obj) {
        if ((i & 2) != 0) {
            transition = new AutoTransition();
        }
        if ((i & 4) != 0) {
            ViewParent parent = textView.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            viewGroup = (ViewGroup) parent;
        }
        expand(textView, charSequence, transition, viewGroup);
    }

    public static final void expand(TextView expand, CharSequence mainContent, Transition transition, ViewGroup sceneRoot) {
        Intrinsics.checkNotNullParameter(expand, "$this$expand");
        Intrinsics.checkNotNullParameter(mainContent, "mainContent");
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        expand.setMaxLines(Integer.MAX_VALUE);
        expand.setText(mainContent);
        if (transition != null) {
            TransitionManager.beginDelayedTransition(sceneRoot, transition);
        }
    }

    public static /* synthetic */ void setTextWithSuffix$default(final TextView textView, CharSequence charSequence, CharSequence charSequence2, final int i, Function1 function1, Function1 function12, Function3 function3, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = new Function1<CharSequence, Unit>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapperKt$setTextWithSuffix$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence3) {
                    invoke2(charSequence3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CharSequence it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }
            };
        }
        Function1 function13 = function1;
        if ((i2 & 16) != 0) {
            function12 = new Function1<CharSequence, Unit>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapperKt$setTextWithSuffix$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence3) {
                    invoke2(charSequence3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CharSequence text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    textView.setText(text);
                    textView.setMaxLines(i);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                }
            };
        }
        setTextWithSuffix(textView, charSequence, charSequence2, i, function13, function12, function3);
    }

    public static final void setTextWithSuffix(TextView setTextWithSuffix, CharSequence mainContent, CharSequence suffix, int i, Function1<? super CharSequence, Unit> onSuccess, Function1<? super CharSequence, Unit> onFailed, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        Intrinsics.checkNotNullParameter(setTextWithSuffix, "$this$setTextWithSuffix");
        Intrinsics.checkNotNullParameter(mainContent, "mainContent");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        GlTextViewSuffixWrapperKt$setTextWithSuffix$3 glTextViewSuffixWrapperKt$setTextWithSuffix$3 = new GlTextViewSuffixWrapperKt$setTextWithSuffix$3(setTextWithSuffix, onFailed, setTextWithSuffix.getText(), mainContent, suffix, function3, onSuccess);
        if (setTextWithSuffix.getLayout() == null) {
            setTextWithSuffix.addOnLayoutChangeListener(new GlTextViewSuffixWrapperKt$setTextWithSuffix$listener$1(setTextWithSuffix, onFailed, glTextViewSuffixWrapperKt$setTextWithSuffix$3, mainContent, suffix, i, function3));
            setTextWithSuffix.requestLayout();
        } else {
            System.currentTimeMillis();
            glTextViewSuffixWrapperKt$setTextWithSuffix$3.invoke(binarySearch(setTextWithSuffix, mainContent, suffix, i, function3));
            System.currentTimeMillis();
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.glority.widget.uitls.GlTextViewSuffixWrapperKt$binarySearch$1] */
    public static final int binarySearch(final TextView textView, final CharSequence charSequence, final CharSequence charSequence2, int i, final Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        ?? r8 = new Function2<Integer, Integer, Integer>() { // from class: com.glority.widget.uitls.GlTextViewSuffixWrapperKt$binarySearch$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
                return Integer.valueOf(invoke(num.intValue(), num2.intValue()));
            }

            public final int invoke(int i2, int i3) {
                String str;
                int i4 = (i2 << 16) | i3;
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i4));
                if (num != null) {
                    return num.intValue();
                }
                intRef.element++;
                String str2 = charSequence.subSequence(i2, i3).toString() + charSequence2;
                TextView textView2 = textView;
                Function3 function32 = function3;
                if (function32 == null || (str = (CharSequence) function32.invoke(str2, charSequence2, Integer.valueOf(i3))) == null) {
                    str = str2;
                }
                textView2.setText(str);
                int lineCount = textView.getLineCount();
                linkedHashMap.put(Integer.valueOf(i4), Integer.valueOf(lineCount));
                return lineCount;
            }
        };
        if (textView.getLayout() == null) {
            return -1;
        }
        if (r8.invoke(0, charSequence.length()) <= i) {
            textView.setText(charSequence);
            return charSequence.length();
        }
        int length = charSequence.length();
        int i2 = 0;
        while (true) {
            if (i2 > length) {
                break;
            }
            int i3 = (i2 + length) / 2;
            int invoke = r8.invoke(0, i3);
            String str = "binarySearch: (" + i2 + ", " + i3 + ", " + length + "), pLineCount = " + invoke;
            if (invoke < i) {
                String str2 = str + ", targetLineCount = " + i + ", pLineCount < targetLineCount";
                i2 = i3 + 1;
            } else if (invoke == i) {
                i2 = i3 + 1;
                int invoke2 = r8.invoke(0, i2);
                String str3 = str + ", nLineCount = " + invoke2;
                int i4 = i + 1;
                if (invoke2 >= i4) {
                    if (invoke2 == i4) {
                        return i3;
                    }
                }
            } else {
                length = i3 - 1;
            }
        }
        return -1;
    }
}
