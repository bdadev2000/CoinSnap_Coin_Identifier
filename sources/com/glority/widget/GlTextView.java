package com.glority.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import com.glority.android.core.app.AppContext;
import com.glority.android.ui.base.LocaleManager;
import com.glority.android.uimaker.parameter.ClickEnum;
import com.glority.android.uimaker.parameter.IUIMakerView;
import com.glority.android.uimaker.parameter.ResourceConverter;
import com.glority.android.uimaker.parameter.UiMakerOnClickListener;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.attribute.ImageFile;
import com.glority.android.uimaker.parameter.attribute.TextGravityParameter;
import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import com.glority.android.xx.constants.LogEvents;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.uitls.CustomTypefaceSpan;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GlTextView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001JB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u0010\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0003H\u0002J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\u0012\u00102\u001a\u00020+2\b\u00103\u001a\u0004\u0018\u000104H\u0014J0\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0014J \u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020>2\u0006\u0010.\u001a\u00020\u0003H\u0016J\u000e\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020\rJ\u000e\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020#J\u001c\u0010C\u001a\u00020+2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010H\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0003H\u0002J\u0010\u0010I\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0003H\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001e\u0010\u0014R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006K"}, d2 = {"Lcom/glority/widget/GlTextView;", "Lcom/google/android/material/textview/MaterialTextView;", "Lcom/glority/android/uimaker/parameter/IUIMakerView;", "Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "angle", "autoResize", "", "endColor", "normalTypeface", "Landroid/graphics/Typeface;", "shader0", "Landroid/graphics/LinearGradient;", "getShader0", "()Landroid/graphics/LinearGradient;", "shader0$delegate", "Lkotlin/Lazy;", "shader180", "getShader180", "shader180$delegate", "shader270", "getShader270", "shader270$delegate", "shader90", "getShader90", "shader90$delegate", "startColor", "strikethroughList", "", "Lcom/glority/widget/GlTextView$StrikethroughText;", "uiMakerOnClickListener", "Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "getUiMakerOnClickListener", "()Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "setUiMakerOnClickListener", "(Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;)V", "clearGradient", "", "clearStrikethrough", "getSuitFontFamily", "textViewParameter", "getUiMakerViewTag", "", "getViewContext", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, LogEvents.bottom, "parseParameter", "loadLocalResource", "resourceConverter", "Lcom/glority/android/uimaker/parameter/ResourceConverter;", "setMediumStyle", "medium", "setStrikethrough", "word", "setText", "text", "", "type", "Landroid/widget/TextView$BufferType;", "suitFontFamily", "suitGravity", "StrikethroughText", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlTextView extends MaterialTextView implements IUIMakerView<TextViewParameter> {
    private int angle;
    private boolean autoResize;
    private int endColor;
    private final Typeface normalTypeface;

    /* renamed from: shader0$delegate, reason: from kotlin metadata */
    private final Lazy shader0;

    /* renamed from: shader180$delegate, reason: from kotlin metadata */
    private final Lazy shader180;

    /* renamed from: shader270$delegate, reason: from kotlin metadata */
    private final Lazy shader270;

    /* renamed from: shader90$delegate, reason: from kotlin metadata */
    private final Lazy shader90;
    private int startColor;
    private List<StrikethroughText> strikethroughList;
    private UiMakerOnClickListener uiMakerOnClickListener;

    public GlTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GlTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearGradient getShader0() {
        return (LinearGradient) this.shader0.getValue();
    }

    private final LinearGradient getShader180() {
        return (LinearGradient) this.shader180.getValue();
    }

    private final LinearGradient getShader270() {
        return (LinearGradient) this.shader270.getValue();
    }

    private final LinearGradient getShader90() {
        return (LinearGradient) this.shader90.getValue();
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public int getColor(ColorParameter colorParameter) {
        return IUIMakerView.DefaultImpls.getColor(this, colorParameter);
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void setDrawable(boolean z, ImageFile imageFile, ResourceConverter resourceConverter, Function1<? super Drawable, Unit> callback) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        IUIMakerView.DefaultImpls.setDrawable(this, z, imageFile, resourceConverter, callback);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlTextView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.GlTextView.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Typeface create = Typeface.create("sans-serif-medium", 0);
        Intrinsics.checkNotNullExpressionValue(create, "Typeface.create(\"sans-se…medium\", Typeface.NORMAL)");
        this.normalTypeface = create;
        this.autoResize = true;
        this.strikethroughList = new ArrayList();
        this.shader0 = LazyKt.lazy(new Function0<LinearGradient>() { // from class: com.glority.widget.GlTextView$shader0$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LinearGradient invoke() {
                int i2;
                int i3;
                float width = GlTextView.this.getWidth();
                i2 = GlTextView.this.startColor;
                i3 = GlTextView.this.endColor;
                return new LinearGradient(0.0f, 0.0f, width, 0.0f, i2, i3, Shader.TileMode.REPEAT);
            }
        });
        this.shader90 = LazyKt.lazy(new Function0<LinearGradient>() { // from class: com.glority.widget.GlTextView$shader90$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LinearGradient invoke() {
                int i2;
                int i3;
                float height = GlTextView.this.getHeight();
                i2 = GlTextView.this.startColor;
                i3 = GlTextView.this.endColor;
                return new LinearGradient(0.0f, height, 0.0f, 0.0f, i2, i3, Shader.TileMode.REPEAT);
            }
        });
        this.shader180 = LazyKt.lazy(new Function0<LinearGradient>() { // from class: com.glority.widget.GlTextView$shader180$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LinearGradient invoke() {
                int i2;
                int i3;
                float width = GlTextView.this.getWidth();
                i2 = GlTextView.this.startColor;
                i3 = GlTextView.this.endColor;
                return new LinearGradient(width, 0.0f, 0.0f, 0.0f, i2, i3, Shader.TileMode.REPEAT);
            }
        });
        this.shader270 = LazyKt.lazy(new Function0<LinearGradient>() { // from class: com.glority.widget.GlTextView$shader270$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LinearGradient invoke() {
                int i2;
                int i3;
                float height = GlTextView.this.getHeight();
                i2 = GlTextView.this.startColor;
                i3 = GlTextView.this.endColor;
                return new LinearGradient(0.0f, 0.0f, 0.0f, height, i2, i3, Shader.TileMode.REPEAT);
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GlTextView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.GlTextView)");
        if (obtainStyledAttributes.getBoolean(R.styleable.GlTextView_medium_style, false)) {
            TextPaint paint = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "paint");
            paint.setTypeface(create);
        }
        this.startColor = obtainStyledAttributes.getColor(R.styleable.GlTextView_start_color, 0);
        this.endColor = obtainStyledAttributes.getColor(R.styleable.GlTextView_end_color, 0);
        this.angle = obtainStyledAttributes.getInt(R.styleable.GlTextView_angle, 0);
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.GlTextView_auto_resize, true);
        this.autoResize = z;
        if (z) {
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, 6, (int) getTextSize(), 1, 0);
        }
        obtainStyledAttributes.recycle();
        invalidate();
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public UiMakerOnClickListener getUiMakerOnClickListener() {
        return this.uiMakerOnClickListener;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void setUiMakerOnClickListener(UiMakerOnClickListener uiMakerOnClickListener) {
        this.uiMakerOnClickListener = uiMakerOnClickListener;
    }

    public final void setMediumStyle(boolean medium) {
        if (medium) {
            TextPaint paint = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "paint");
            paint.setTypeface(this.normalTypeface);
        } else {
            TextPaint paint2 = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint2, "paint");
            paint2.setTypeface(null);
        }
        invalidate();
    }

    public final void clearGradient() {
        this.startColor = 0;
        this.endColor = 0;
        this.angle = 0;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        if (this.autoResize && ((int) getTextSize()) > 6) {
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, 6, (int) getTextSize(), 1, 0);
        }
        super.setText(text, type);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            if (this.startColor == 0 || this.endColor == 0) {
                TextPaint paint = getPaint();
                Intrinsics.checkNotNullExpressionValue(paint, "paint");
                paint.setShader(null);
                return;
            }
            int i = (this.angle / 90) % 4;
            if (i == 0) {
                TextPaint paint2 = getPaint();
                Intrinsics.checkNotNullExpressionValue(paint2, "paint");
                paint2.setShader(getShader0());
            } else if (i == 1) {
                TextPaint paint3 = getPaint();
                Intrinsics.checkNotNullExpressionValue(paint3, "paint");
                paint3.setShader(getShader90());
            } else if (i == 2) {
                TextPaint paint4 = getPaint();
                Intrinsics.checkNotNullExpressionValue(paint4, "paint");
                paint4.setShader(getShader180());
            } else {
                TextPaint paint5 = getPaint();
                Intrinsics.checkNotNullExpressionValue(paint5, "paint");
                paint5.setShader(getShader270());
            }
        }
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public void parseParameter(boolean loadLocalResource, ResourceConverter resourceConverter, TextViewParameter textViewParameter) {
        Intrinsics.checkNotNullParameter(resourceConverter, "resourceConverter");
        Intrinsics.checkNotNullParameter(textViewParameter, "textViewParameter");
        this.autoResize = false;
        GlTextView glTextView = this;
        TextViewCompat.setAutoSizeTextTypeWithDefaults(glTextView, 0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setTextSize(0, resourceConverter.getFontSize(context, textViewParameter));
        if (Intrinsics.areEqual(textViewParameter.getTextCase(), TextViewParameter.INSTANCE.getText_case_upper())) {
            setAllCaps(true);
        }
        Float lineHeightPercent = textViewParameter.getLineHeightPercent();
        if (lineHeightPercent != null) {
            setLineSpacing(0.0f, lineHeightPercent.floatValue());
        }
        if (textViewParameter.getLineHeightPx() > 0) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setLineHeight(resourceConverter.getNormalDimension(context2, (int) textViewParameter.getLineHeightPx()));
        }
        String text = resourceConverter.getText(textViewParameter.getTextResId(), textViewParameter.getText());
        String str = text;
        SpannableString spannableString = new SpannableString(str);
        setAlpha(textViewParameter.getOpacity());
        int i = 17;
        spannableString.setSpan(new RelativeSizeSpan(resourceConverter.getFontRate() * 1.0f), 0, text.length(), 17);
        suitGravity(textViewParameter);
        setTextColor(resourceConverter.colorConvert(textViewParameter.getTextColorParameter()));
        Locale locale = Locale.JAPANESE;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.JAPANESE");
        String language = locale.getLanguage();
        Locale locale2 = Locale.CHINESE;
        Intrinsics.checkNotNullExpressionValue(locale2, "Locale.CHINESE");
        List listOf = CollectionsKt.listOf((Object[]) new String[]{language, locale2.getLanguage()});
        Locale locale3 = LocaleManager.getLocale(getResources());
        Intrinsics.checkNotNullExpressionValue(locale3, "LocaleManager.getLocale(resources)");
        setIncludeFontPadding(listOf.contains(locale3.getLanguage()));
        for (TextViewParameter textViewParameter2 : textViewParameter.getChildTextViewParameter()) {
            String text2 = resourceConverter.getText(textViewParameter2.getTextResId(), textViewParameter2.getText());
            int i2 = i;
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, text2, 0, false, 6, (Object) null);
            int length = text2.length() + indexOf$default;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ForegroundColorSpan(resourceConverter.colorConvert(textViewParameter2.getTextColorParameter())));
            arrayList.add(new CustomTypefaceSpan(getSuitFontFamily(textViewParameter2)));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            float fontSize = resourceConverter.getFontSize(context3, textViewParameter2);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            arrayList.add(new RelativeSizeSpan(fontSize / resourceConverter.getFontSize(context4, textViewParameter)));
            for (Object obj : arrayList) {
                if (indexOf$default != -1 && length != -1) {
                    spannableString.setSpan(obj, indexOf$default, length, i2);
                }
            }
            i = i2;
        }
        setText(spannableString);
        if (Intrinsics.areEqual(textViewParameter.getText(), "Restore")) {
            setForeground(ContextCompat.getDrawable(getContext(), R.drawable.ripple_circle));
            setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.GlTextView$parseParameter$3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UiMakerOnClickListener uiMakerOnClickListener = GlTextView.this.getUiMakerOnClickListener();
                    if (uiMakerOnClickListener != null) {
                        uiMakerOnClickListener.onClick(ClickEnum.restore);
                    }
                }
            });
        }
        suitFontFamily(textViewParameter);
        if (Intrinsics.areEqual(textViewParameter.getTextAutoResize(), TextViewParameter.INSTANCE.getType_autoResize_width_and_height())) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            int fontSize2 = (int) resourceConverter.getFontSize(context5, 5);
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "context");
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(glTextView, fontSize2, (int) resourceConverter.getFontSize(context6, textViewParameter.getFontSize() + 5), 1, 0);
            return;
        }
        if (Intrinsics.areEqual(textViewParameter.getTextAutoResize(), TextViewParameter.INSTANCE.getType_autoResize_normal())) {
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "context");
            int fontSize3 = (int) resourceConverter.getFontSize(context7, 5);
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "context");
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(glTextView, fontSize3, (int) resourceConverter.getFontSize(context8, textViewParameter.getFontSize()), 1, 0);
            return;
        }
        String textAutoResize = textViewParameter.getTextAutoResize();
        if (textAutoResize == null || textAutoResize.length() == 0) {
            return;
        }
        Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "context");
        int fontSize4 = (int) resourceConverter.getFontSize(context9, 5);
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "context");
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(glTextView, fontSize4, (int) resourceConverter.getFontSize(context10, textViewParameter.getFontSize() + 5), 1, 0);
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public Context getViewContext() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return context;
    }

    @Override // com.glority.android.uimaker.parameter.IUIMakerView
    public String getUiMakerViewTag() {
        return "GlTextView";
    }

    private final void suitFontFamily(TextViewParameter textViewParameter) {
        try {
            TextPaint paint = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "paint");
            paint.setTypeface(getSuitFontFamily(textViewParameter));
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    private final Typeface getSuitFontFamily(TextViewParameter textViewParameter) {
        Typeface typeface;
        try {
            String fontPostScriptName = textViewParameter.getFontPostScriptName();
            if (fontPostScriptName == null) {
                fontPostScriptName = textViewParameter.getFontFamily();
            }
            if (!StringsKt.contains((CharSequence) fontPostScriptName, (CharSequence) "medium", true)) {
                if (!StringsKt.contains((CharSequence) fontPostScriptName, (CharSequence) TtmlNode.BOLD, true) || !StringsKt.contains((CharSequence) fontPostScriptName, (CharSequence) TtmlNode.ITALIC, true)) {
                    if (StringsKt.contains((CharSequence) fontPostScriptName, (CharSequence) TtmlNode.BOLD, true)) {
                        typeface = Typeface.create("sans-serif-bold", 1);
                    } else {
                        if (!StringsKt.contains((CharSequence) fontPostScriptName, (CharSequence) "black", true) && !StringsKt.contains((CharSequence) fontPostScriptName, (CharSequence) "heavy", true)) {
                            if (StringsKt.contains((CharSequence) fontPostScriptName, (CharSequence) TtmlNode.ITALIC, true)) {
                                typeface = Typeface.create("sans-serif-italic", 2);
                            } else if (StringsKt.contains((CharSequence) fontPostScriptName, (CharSequence) "light", true)) {
                                typeface = Typeface.create("sans-serif-light", 0);
                            } else {
                                typeface = Typeface.create(C.SANS_SERIF_NAME, 0);
                            }
                        }
                        typeface = Typeface.create("sans-serif-black", 1);
                    }
                } else {
                    typeface = Typeface.create("sans-serif-bold", 3);
                }
            } else {
                typeface = Typeface.create("sans-serif-medium", 0);
            }
            Intrinsics.checkNotNullExpressionValue(typeface, "typeface");
            return typeface;
        } catch (Throwable unused) {
            Typeface typeface2 = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(typeface2, "Typeface.DEFAULT");
            return typeface2;
        }
    }

    private final void suitGravity(TextViewParameter textViewParameter) {
        if (Intrinsics.areEqual(textViewParameter.getTextAlignHorizontal(), TextGravityParameter.INSTANCE.getCENTER())) {
            setGravity(1);
        } else if (Intrinsics.areEqual(textViewParameter.getTextAlignHorizontal(), TextGravityParameter.INSTANCE.getRIGHT())) {
            setGravity(GravityCompat.END);
        } else {
            setGravity(GravityCompat.START);
        }
        if (Intrinsics.areEqual(textViewParameter.getTextAlignVertical(), TextGravityParameter.INSTANCE.getCENTER())) {
            setGravity(getGravity() | 16);
        } else if (Intrinsics.areEqual(textViewParameter.getTextAlignVertical(), TextGravityParameter.INSTANCE.getBOTTOM())) {
            setGravity(getGravity() | 80);
        } else {
            setGravity(getGravity() | 48);
        }
    }

    public final void setStrikethrough(final StrikethroughText word) {
        Intrinsics.checkNotNullParameter(word, "word");
        post(new Runnable() { // from class: com.glority.widget.GlTextView$setStrikethrough$1
            @Override // java.lang.Runnable
            public final void run() {
                List list;
                String text = GlTextView.this.getText();
                if (text == null) {
                }
                GlTextView.StrikethroughText strikethroughText = word;
                strikethroughText.setStart(StringsKt.indexOf$default(text, strikethroughText.getWord(), 0, false, 6, (Object) null));
                if (word.getStart() != -1) {
                    GlTextView.StrikethroughText strikethroughText2 = word;
                    strikethroughText2.setEnd(StringsKt.indexOf$default(text, strikethroughText2.getWord(), 0, false, 6, (Object) null) + word.getWord().length());
                }
                list = GlTextView.this.strikethroughList;
                list.add(word);
                GlTextView.this.invalidate();
            }
        });
    }

    public final void clearStrikethrough() {
        this.strikethroughList.clear();
        invalidate();
    }

    /* compiled from: GlTextView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/glority/widget/GlTextView$StrikethroughText;", "", "color", "", "word", "", "width", "(ILjava/lang/String;I)V", "getColor", "()I", TtmlNode.END, "getEnd", "setEnd", "(I)V", "start", "getStart", "setStart", "getWidth", "getWord", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class StrikethroughText {
        private final int color;
        private int end;
        private int start;
        private final int width;
        private final String word;

        public StrikethroughText(int i, String word, int i2) {
            Intrinsics.checkNotNullParameter(word, "word");
            this.color = i;
            this.word = word;
            this.width = i2;
        }

        public final int getColor() {
            return this.color;
        }

        public final int getWidth() {
            return this.width;
        }

        public final String getWord() {
            return this.word;
        }

        public final int getStart() {
            return this.start;
        }

        public final void setStart(int i) {
            this.start = i;
        }

        public final int getEnd() {
            return this.end;
        }

        public final void setEnd(int i) {
            this.end = i;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (StrikethroughText strikethroughText : this.strikethroughList) {
            try {
                Paint paint = new Paint();
                paint.setColor(strikethroughText.getColor());
                paint.setStyle(Paint.Style.FILL);
                paint.setStrikeThruText(true);
                paint.setStrokeWidth(strikethroughText.getWidth());
                paint.setFlags(1);
                int start = strikethroughText.getStart();
                int end = strikethroughText.getEnd();
                while (start < end) {
                    int lineForOffset = getLayout().getLineForOffset(start);
                    float primaryHorizontal = getLayout().getPrimaryHorizontal(start);
                    int i = start + 1;
                    float secondaryHorizontal = getLayout().getSecondaryHorizontal(i);
                    getLayout().getLineBounds(lineForOffset, new Rect());
                    if (secondaryHorizontal - primaryHorizontal >= 0 && canvas != null) {
                        canvas.drawLine(primaryHorizontal, (strikethroughText.getWidth() / 2.0f) + r2.centerY(), secondaryHorizontal, r2.centerY() + (strikethroughText.getWidth() / 2.0f), paint);
                    }
                    start = i;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }
}
