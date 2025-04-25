package com.glority.android.cmsui.entity;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.SpanStyle;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.CmsTaxonomyName;
import com.glority.android.cmsui.model.TaxonomyType;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.cmsui.util.FontUtil;
import com.glority.utils.app.ResUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BookNameCardItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u0000 22\u00020\u0001:\u00012B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\t\u0010$\u001a\u00020\u001fHÖ\u0001J \u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J&\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060.2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u00100\u001a\u00020\u0006H\u0002J\t\u00101\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u00063"}, d2 = {"Lcom/glority/android/cmsui/entity/BookNameCardItem;", "Lcom/glority/android/cmsui/entity/BaseFontScaleItem;", "cmsTaxonomyNames", "", "Lcom/glority/android/cmsui/model/CmsTaxonomyName;", "pageFrom", "", "(Ljava/util/List;Ljava/lang/String;)V", "getCmsTaxonomyNames", "()Ljava/util/List;", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPageFrom", "component1", "component2", "copy", "equals", "", "other", "", "formatGenus", "Landroid/text/SpannableString;", "parentTaxonomyName", "formatLatin", "Landroid/text/SpannableStringBuilder;", "currentTaxonomyName", "formatName", "getLayoutId", "", "getParentTypeName", "getScaleSize", "", TtmlNode.ATTR_TTS_FONT_SIZE, "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "rmDupString", "", "commonNames", "latin", "toString", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class BookNameCardItem extends BaseFontScaleItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<CmsTaxonomyName> cmsTaxonomyNames;
    private String name;
    private final String pageFrom;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaxonomyType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaxonomyType.VARIETY.ordinal()] = 1;
            iArr[TaxonomyType.CULTIVAR.ordinal()] = 2;
            iArr[TaxonomyType.GENUS.ordinal()] = 3;
            iArr[TaxonomyType.FAMILY.ordinal()] = 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BookNameCardItem copy$default(BookNameCardItem bookNameCardItem, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bookNameCardItem.cmsTaxonomyNames;
        }
        if ((i & 2) != 0) {
            str = bookNameCardItem.pageFrom;
        }
        return bookNameCardItem.copy(list, str);
    }

    public final List<CmsTaxonomyName> component1() {
        return this.cmsTaxonomyNames;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final BookNameCardItem copy(List<CmsTaxonomyName> cmsTaxonomyNames, String pageFrom) {
        Intrinsics.checkNotNullParameter(cmsTaxonomyNames, "cmsTaxonomyNames");
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        return new BookNameCardItem(cmsTaxonomyNames, pageFrom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookNameCardItem)) {
            return false;
        }
        BookNameCardItem bookNameCardItem = (BookNameCardItem) other;
        return Intrinsics.areEqual(this.cmsTaxonomyNames, bookNameCardItem.cmsTaxonomyNames) && Intrinsics.areEqual(this.pageFrom, bookNameCardItem.pageFrom);
    }

    public int hashCode() {
        List<CmsTaxonomyName> list = this.cmsTaxonomyNames;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.pageFrom;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BookNameCardItem(cmsTaxonomyNames=" + this.cmsTaxonomyNames + ", pageFrom=" + this.pageFrom + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookNameCardItem(List<CmsTaxonomyName> cmsTaxonomyNames, String pageFrom) {
        super(pageFrom);
        Intrinsics.checkNotNullParameter(cmsTaxonomyNames, "cmsTaxonomyNames");
        Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
        this.cmsTaxonomyNames = cmsTaxonomyNames;
        this.pageFrom = pageFrom;
        this.name = "";
        List<CmsTaxonomyName> list = cmsTaxonomyNames;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((CmsTaxonomyName) it.next()).getTaxonomyType().getValue()));
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
        for (CmsTaxonomyName cmsTaxonomyName : this.cmsTaxonomyNames) {
            int value = cmsTaxonomyName.getTaxonomyType().getValue();
            if (num != null && value == num.intValue()) {
                this.name = cmsTaxonomyName.getPreferredName();
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public /* synthetic */ BookNameCardItem(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str);
    }

    public final List<CmsTaxonomyName> getCmsTaxonomyNames() {
        return this.cmsTaxonomyNames;
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_cms_book_name_card;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, final BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.cmsTaxonomyNames.size() != 2) {
            return;
        }
        List<CmsTaxonomyName> list = this.cmsTaxonomyNames;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((CmsTaxonomyName) it.next()).getTaxonomyType().getValue()));
        }
        ArrayList arrayList2 = arrayList;
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
        Integer num2 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        for (final CmsTaxonomyName cmsTaxonomyName : this.cmsTaxonomyNames) {
            int value = cmsTaxonomyName.getTaxonomyType().getValue();
            if (num != null && value == num.intValue()) {
                for (final CmsTaxonomyName cmsTaxonomyName2 : this.cmsTaxonomyNames) {
                    int value2 = cmsTaxonomyName2.getTaxonomyType().getValue();
                    if (num2 != null && value2 == num2.intValue()) {
                        helper.setText(R.id.tv_name, formatName(cmsTaxonomyName, cmsTaxonomyName2));
                        LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_alias);
                        linearLayout.removeAllViews();
                        final TextView textView = new TextView(linearLayout.getContext());
                        setTextScaleSize(textView, FontUtil.INSTANCE.getFont30());
                        textView.setTextColor(Color.parseColor("#999999"));
                        textView.setText(ResUtils.getString(R.string.also_known_as) + ":");
                        linearLayout.addView(textView);
                        List<String> commonNames = cmsTaxonomyName.getCommonNames();
                        if (commonNames != null) {
                            for (String str : commonNames) {
                                if (!Intrinsics.areEqual(str, cmsTaxonomyName.getPreferredName())) {
                                    View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.item_name_card_common_name_ab1, (ViewGroup) linearLayout, false);
                                    TextView commonNameTextView = (TextView) inflate.findViewById(R.id.tv_name);
                                    Intrinsics.checkNotNullExpressionValue(commonNameTextView, "commonNameTextView");
                                    commonNameTextView.setText(str);
                                    linearLayout.addView(inflate);
                                    getContentTextViews().add(commonNameTextView);
                                }
                            }
                        }
                        SpannableStringBuilder formatLatin = formatLatin(cmsTaxonomyName);
                        helper.setText(R.id.tv_latin, formatLatin).setGone(R.id.tv_latin, formatLatin != null);
                        SpannableString formatGenus = formatGenus(cmsTaxonomyName2);
                        CharSequence charSequence = formatGenus;
                        BaseViewHolder gone = helper.setGone(R.id.tv_genus, !(charSequence == null || charSequence.length() == 0));
                        int i = R.id.tv_genus;
                        if (formatGenus == null) {
                        }
                        gone.setText(i, charSequence);
                        observeFontScale(context, new Function1<Float, Unit>() { // from class: com.glority.android.cmsui.entity.BookNameCardItem$render$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                invoke(f.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(float f) {
                                SpannableStringBuilder formatName;
                                SpannableString formatGenus2;
                                BookNameCardItem.this.setTextScaleSize((TextView) helper.getView(R.id.tv_name), FontUtil.INSTANCE.getFont30());
                                formatName = BookNameCardItem.this.formatName(cmsTaxonomyName, cmsTaxonomyName2);
                                helper.setText(R.id.tv_name, formatName);
                                BookNameCardItem.this.setTextScaleSize(textView, FontUtil.INSTANCE.getFont30());
                                Iterator<T> it2 = BookNameCardItem.this.getContentTextViews().iterator();
                                while (it2.hasNext()) {
                                    BookNameCardItem.this.setTextScaleSize((TextView) it2.next(), FontUtil.INSTANCE.getFont32());
                                }
                                BookNameCardItem.this.setTextScaleSize((TextView) helper.getView(R.id.tv_latin), FontUtil.INSTANCE.getFont30());
                                BookNameCardItem.this.setTextScaleSize((TextView) helper.getView(R.id.tv_genus), FontUtil.INSTANCE.getFont28());
                                formatGenus2 = BookNameCardItem.this.formatGenus(cmsTaxonomyName2);
                                String str2 = formatGenus2;
                                BaseViewHolder gone2 = helper.setGone(R.id.tv_genus, true ^ (str2 == null || str2.length() == 0));
                                int i2 = R.id.tv_genus;
                                if (formatGenus2 == null) {
                                }
                                gone2.setText(i2, str2);
                            }
                        });
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpannableString formatGenus(CmsTaxonomyName parentTaxonomyName) {
        String str;
        String str2;
        String latinName = parentTaxonomyName.getLatinName();
        if (TextUtils.isEmpty(latinName)) {
            return null;
        }
        String string = ResUtils.getString(getParentTypeName(parentTaxonomyName));
        List<String> rmDupString = rmDupString(parentTaxonomyName.getCommonNames(), latinName);
        String str3 = string + ": " + latinName;
        int size = rmDupString.size();
        int i = 0;
        String str4 = "";
        if (size == 1) {
            str = rmDupString.get(0);
            String string2 = ResUtils.getString(R.string.text_namecard_commonlynamed, str3, str);
            Intrinsics.checkNotNullExpressionValue(string2, "ResUtils.getString(R.str…ommonlynamed, str1, str2)");
            str2 = "";
            str4 = string2;
        } else if (size <= 1) {
            str = "";
            str2 = str;
        } else {
            str2 = "";
            for (Object obj : rmDupString) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str5 = (String) obj;
                if (i < size - 2) {
                    str4 = str4 + str5 + ',';
                } else if (i == size - 1) {
                    str4 = str4 + str5;
                } else {
                    str2 = str5;
                }
                i = i2;
            }
            String string3 = ResUtils.getString(R.string.text_namecard_commonlynamed_or, str3, str4, str2);
            Intrinsics.checkNotNullExpressionValue(string3, "ResUtils.getString(R.str…med_or, str1, str2, str3)");
            String str6 = str4;
            str4 = string3;
            str = str6;
        }
        SpanStyle spanStyle = new SpanStyle(str4, latinName);
        int i3 = (int) 4279571733L;
        return SpanStyle.INSTANCE.setSpanSize(SpanStyle.INSTANCE.setSpanColor(SpanStyle.INSTANCE.setSpanBold(spanStyle.setTextColor(i3).setTextSize((int) getScaleSize(ResUtils.getDimension(R.dimen.x36))).setBold().setItalic().create(), str, str2), i3, str, str2), (int) getScaleSize(ResUtils.getDimension(R.dimen.x32)), str, str2);
    }

    private final float getScaleSize(float fontSize) {
        Float value = getFontScale().getValue();
        if (value == null) {
            value = Float.valueOf(1.0f);
        }
        Intrinsics.checkNotNullExpressionValue(value, "fontScale.value?:1f");
        return fontSize * value.floatValue();
    }

    private final int getParentTypeName(CmsTaxonomyName parentTaxonomyName) {
        return parentTaxonomyName.getTaxonomyType() == TaxonomyType.FAMILY ? R.string.item_family : R.string.item_genus;
    }

    private final List<String> rmDupString(List<String> commonNames, String latin) {
        if (commonNames == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : commonNames) {
            if (!Intrinsics.areEqual((String) obj, latin)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final SpannableStringBuilder formatLatin(CmsTaxonomyName currentTaxonomyName) {
        String latinName = currentTaxonomyName.getLatinName();
        if (TextUtils.isEmpty(latinName)) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ResUtils.getString(R.string.label_text_botanical_name));
        spannableStringBuilder.append((CharSequence) ": ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) latinName);
        spannableStringBuilder.setSpan(new ForegroundColorSpan((int) 4288256409L), 0, length - 1, 33);
        spannableStringBuilder.setSpan(new StyleSpan(2), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpannableStringBuilder formatName(CmsTaxonomyName currentTaxonomyName, CmsTaxonomyName parentTaxonomyName) {
        int i;
        int i2 = (int) 4280427042L;
        int scaleSize = (int) getScaleSize(ResUtils.getDimension(R.dimen.x40));
        String preferredName = currentTaxonomyName.getPreferredName();
        String preferredName2 = parentTaxonomyName.getPreferredName();
        boolean z = (Intrinsics.areEqual(preferredName2, "Fungi") ^ true) && preferredName2 != null && Intrinsics.areEqual(preferredName2, parentTaxonomyName.getLatinName());
        if (TextUtils.isEmpty(preferredName2)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(preferredName);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(scaleSize, false), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), 0, spannableStringBuilder.length(), 33);
            if (!Intrinsics.areEqual(preferredName, currentTaxonomyName.getLatinName())) {
                return spannableStringBuilder;
            }
            spannableStringBuilder.setSpan(new StyleSpan(2), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[currentTaxonomyName.getTaxonomyType().ordinal()];
        if (i3 == 1) {
            i = R.string.label_text_a_variety_of;
        } else if (i3 == 2) {
            i = R.string.label_text_a_cultivar_of;
        } else if (i3 == 3) {
            i = R.string.plant_a_genus_of;
        } else if (i3 == 4) {
            i = R.string.plant_a_family_of;
        } else {
            i = R.string.label_text_a_species_of;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ResUtils.getString(i, preferredName, preferredName2));
        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder3, preferredName, 0, false, 6, (Object) null);
        Intrinsics.checkNotNull(preferredName2);
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) spannableStringBuilder3, preferredName2, preferredName.length(), false, 4, (Object) null);
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(scaleSize, false), indexOf$default, indexOf$default + preferredName.length(), 33);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(i2), indexOf$default, indexOf$default + preferredName.length(), 33);
        spannableStringBuilder2.setSpan(new StyleSpan(Intrinsics.areEqual(preferredName, currentTaxonomyName.getLatinName()) ? 3 : 1), indexOf$default, indexOf$default + preferredName.length(), 33);
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(scaleSize, false), indexOf$default2, preferredName2.length() + indexOf$default2, 33);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(i2), indexOf$default2, preferredName2.length() + indexOf$default2, 33);
        spannableStringBuilder2.setSpan(new StyleSpan(z ? 3 : 1), indexOf$default2, preferredName2.length() + indexOf$default2, 33);
        String latinName = parentTaxonomyName.getLatinName();
        if (latinName.length() > 0) {
            String str = "(" + latinName + ')';
            spannableStringBuilder2.append((CharSequence) str);
            int indexOf$default3 = StringsKt.indexOf$default((CharSequence) spannableStringBuilder3, str, 0, false, 6, (Object) null);
            int length = str.length() + indexOf$default3;
            spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) getScaleSize(ResUtils.getDimension(R.dimen.x30)), false), indexOf$default3, length, 33);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(i2), indexOf$default3, length, 33);
            spannableStringBuilder2.setSpan(new StyleSpan(2), indexOf$default3, length, 33);
        }
        return spannableStringBuilder2;
    }

    /* compiled from: BookNameCardItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/cmsui/entity/BookNameCardItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/BookNameCardItem;", TtmlNode.TAG_LAYOUT, "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", "pageFrom", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BookNameCardItem create$default(Companion companion, CmsLayout cmsLayout, List list, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            return companion.create(cmsLayout, list, str);
        }

        public final BookNameCardItem create(CmsLayout layout, List<CmsTag> cmsTags, String pageFrom) {
            String str;
            Object obj;
            List<Map<String, Object>> tagValues;
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
            Intrinsics.checkNotNullParameter(pageFrom, "pageFrom");
            List<String> tagNames = layout.getTagNames();
            if (tagNames != null && (str = (String) CollectionsKt.firstOrNull((List) tagNames)) != null) {
                Iterator<T> it = cmsTags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((CmsTag) obj).getTagName(), str)) {
                        break;
                    }
                }
                CmsTag cmsTag = (CmsTag) obj;
                if (cmsTag != null && (tagValues = cmsTag.getTagValues()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : tagValues) {
                        if (CmsTagValueUtil.INSTANCE.isTaxonomyName((Map) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        CmsTaxonomyName convert2TaxonomyName = CmsTagValueUtil.INSTANCE.convert2TaxonomyName((Map) it2.next());
                        if (convert2TaxonomyName != null) {
                            arrayList2.add(convert2TaxonomyName);
                        }
                    }
                    return new BookNameCardItem(CollectionsKt.toMutableList((Collection) arrayList2), pageFrom);
                }
            }
            return null;
        }
    }
}
