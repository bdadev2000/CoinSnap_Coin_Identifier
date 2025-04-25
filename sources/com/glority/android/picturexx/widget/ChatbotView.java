package com.glority.android.picturexx.widget;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.MarginLayoutParamsCompat;
import com.glority.android.picturexx.business.R;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.widget.tooltips.GlToolTips;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fR \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/widget/ChatbotView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animationMap", "Ljava/util/HashMap;", "", "Lkotlin/Function0;", "", "showState", "", "showTips", "show", "hide", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ChatbotView extends AppCompatImageView {
    public static final int $stable = 8;
    private HashMap<String, Function0<Unit>> animationMap;
    private int showState;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatbotView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChatbotView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.animationMap = new HashMap<>();
        setVisibility(CoinAbTestUtils.INSTANCE.enableChatbot() ? 0 : 8);
    }

    public final void showTips() {
        if (getVisibility() == 0) {
            post(new Runnable() { // from class: com.glority.android.picturexx.widget.ChatbotView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatbotView.showTips$lambda$1(ChatbotView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTips$lambda$1(ChatbotView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final GlToolTips showDark = GlToolTips.Builder.setText$default(new GlToolTips.Builder(context).setMaxWith(this$0.getResources().getDimensionPixelOffset(R.dimen.x518)), R.string.chatbot_welcome_toast, (GlToolTips.Type) null, 2, (Object) null).showDark(this$0, GlToolTips.Alignment.TOP);
        Handler handler = this$0.getHandler();
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.glority.android.picturexx.widget.ChatbotView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ChatbotView.showTips$lambda$1$lambda$0(GlToolTips.this);
                }
            }, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTips$lambda$1$lambda$0(GlToolTips tips) {
        Intrinsics.checkNotNullParameter(tips, "$tips");
        tips.dismiss();
    }

    public final void show() {
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.glority.android.picturexx.widget.ChatbotView$show$animator$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ViewPropertyAnimator duration = ChatbotView.this.animate().translationX(0.0f).setDuration(500L);
                final ChatbotView chatbotView = ChatbotView.this;
                duration.setListener(new Animator.AnimatorListener() { // from class: com.glority.android.picturexx.widget.ChatbotView$show$animator$1.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        ChatbotView.this.showState = 2;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        HashMap hashMap;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        ChatbotView.this.showState = 0;
                        hashMap = ChatbotView.this.animationMap;
                        Function0 function02 = (Function0) hashMap.get("hide");
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                }).start();
            }
        };
        this.animationMap.put("show", function0);
        this.animationMap.remove("hide");
        if (this.showState == 1) {
            function0.invoke();
        }
    }

    public final void hide() {
        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.glority.android.picturexx.widget.ChatbotView$hide$animator$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* compiled from: ChatbotView.kt */
            @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/glority/android/picturexx/widget/ChatbotView$hide$animator$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
            /* renamed from: com.glority.android.picturexx.widget.ChatbotView$hide$animator$1$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 implements Animator.AnimatorListener {
                final /* synthetic */ ChatbotView this$0;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                AnonymousClass1(ChatbotView chatbotView) {
                    this.this$0 = chatbotView;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    this.this$0.showState = 2;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    Handler handler = this.this$0.getHandler();
                    if (handler != null) {
                        final ChatbotView chatbotView = this.this$0;
                        handler.postDelayed(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: INVOKE 
                              (r5v2 'handler' android.os.Handler)
                              (wrap:java.lang.Runnable:0x0011: CONSTRUCTOR (r0v1 'chatbotView' com.glority.android.picturexx.widget.ChatbotView A[DONT_INLINE]) A[MD:(com.glority.android.picturexx.widget.ChatbotView):void (m), WRAPPED] call: com.glority.android.picturexx.widget.ChatbotView$hide$animator$1$1$$ExternalSyntheticLambda0.<init>(com.glority.android.picturexx.widget.ChatbotView):void type: CONSTRUCTOR)
                              (1000 long)
                             VIRTUAL call: android.os.Handler.postDelayed(java.lang.Runnable, long):boolean A[MD:(java.lang.Runnable, long):boolean (c)] in method: com.glority.android.picturexx.widget.ChatbotView$hide$animator$1.1.onAnimationEnd(android.animation.Animator):void, file: classes5.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.glority.android.picturexx.widget.ChatbotView$hide$animator$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 23 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "animation"
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                            com.glority.android.picturexx.widget.ChatbotView r5 = r4.this$0
                            android.os.Handler r5 = r5.getHandler()
                            if (r5 == 0) goto L19
                            com.glority.android.picturexx.widget.ChatbotView r0 = r4.this$0
                            com.glority.android.picturexx.widget.ChatbotView$hide$animator$1$1$$ExternalSyntheticLambda0 r1 = new com.glority.android.picturexx.widget.ChatbotView$hide$animator$1$1$$ExternalSyntheticLambda0
                            r1.<init>(r0)
                            r2 = 1000(0x3e8, double:4.94E-321)
                            r5.postDelayed(r1, r2)
                        L19:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.widget.ChatbotView$hide$animator$1.AnonymousClass1.onAnimationEnd(android.animation.Animator):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void onAnimationEnd$lambda$0(ChatbotView this$0) {
                        HashMap hashMap;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.showState = 1;
                        hashMap = this$0.animationMap;
                        Function0 function0 = (Function0) hashMap.get("show");
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ChatbotView.this.animate().translationX((ChatbotView.this.getWidth() / 2.0f) + ((ChatbotView.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) r3) : 0) / 2.0f)).setDuration(500L).setListener(new AnonymousClass1(ChatbotView.this)).start();
                }
            };
            this.animationMap.put("hide", function0);
            this.animationMap.remove("show");
            if (this.showState == 0) {
                function0.invoke();
            }
        }
    }
