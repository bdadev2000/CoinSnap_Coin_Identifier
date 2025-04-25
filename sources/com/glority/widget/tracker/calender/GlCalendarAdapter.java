package com.glority.widget.tracker.calender;

import android.view.View;
import android.widget.TextView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.widget.R;
import com.glority.widget.tracker.calender.GlCalendarView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlCalendarAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/glority/widget/tracker/calender/GlCalendarAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "", "Lcom/glority/widget/tracker/calender/GlCalendarView$DateItem;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "calendarView", "Lcom/glority/widget/tracker/calender/GlCalendarView;", "(Lcom/glority/widget/tracker/calender/GlCalendarView;)V", "itemLayoutIds", "", "convert", "", "helper", "item", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlCalendarAdapter extends BaseQuickAdapter<List<? extends GlCalendarView.DateItem>, BaseViewHolder> {
    private final GlCalendarView calendarView;
    private final List<Integer> itemLayoutIds;

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public /* bridge */ /* synthetic */ void convert(BaseViewHolder baseViewHolder, List<? extends GlCalendarView.DateItem> list) {
        convert2(baseViewHolder, (List<GlCalendarView.DateItem>) list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlCalendarAdapter(GlCalendarView calendarView) {
        super(R.layout.item_gl_calendar_container, null, 2, null);
        Intrinsics.checkNotNullParameter(calendarView, "calendarView");
        this.calendarView = calendarView;
        this.itemLayoutIds = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.id.mon_layout), Integer.valueOf(R.id.tue_layout), Integer.valueOf(R.id.wed_layout), Integer.valueOf(R.id.thu_layout), Integer.valueOf(R.id.fri_layout), Integer.valueOf(R.id.sat_layout), Integer.valueOf(R.id.sun_layout)});
    }

    /* renamed from: convert, reason: avoid collision after fix types in other method */
    protected void convert2(final BaseViewHolder helper, List<GlCalendarView.DateItem> item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.size() != this.itemLayoutIds.size()) {
            return;
        }
        int i = 0;
        for (Object obj : item) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final GlCalendarView.DateItem dateItem = (GlCalendarView.DateItem) obj;
            View view = helper.getView(this.itemLayoutIds.get(i).intValue());
            View findViewById = view.findViewById(R.id.week_day_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<TextView>(R.id.week_day_tv)");
            ((TextView) findViewById).setText(dateItem.getName());
            View findViewById2 = view.findViewById(R.id.week_count_tv);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<TextView>(R.id.week_count_tv)");
            ((TextView) findViewById2).setText(dateItem.getNumber());
            if (dateItem.isToday()) {
                view.setBackgroundResource(R.drawable.gl_bg_view_item_week_unselected_today);
            } else if (!dateItem.getSelected()) {
                view.setBackgroundResource(R.drawable.gl_bg_view_item_week_unselected);
            }
            if (dateItem.getSelected()) {
                view.setBackgroundResource(R.drawable.gl_bg_view_item_week_selected);
                TextView textView = (TextView) view.findViewById(R.id.week_day_tv);
                View view2 = helper.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "helper.itemView");
                textView.setTextColor(view2.getResources().getColor(R.color.gl_bg_white));
                TextView textView2 = (TextView) view.findViewById(R.id.week_count_tv);
                View view3 = helper.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "helper.itemView");
                textView2.setTextColor(view3.getResources().getColor(R.color.gl_bg_white));
            } else {
                TextView textView3 = (TextView) view.findViewById(R.id.week_day_tv);
                View view4 = helper.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "helper.itemView");
                textView3.setTextColor(view4.getResources().getColor(R.color.gl_text_color3));
                TextView textView4 = (TextView) view.findViewById(R.id.week_count_tv);
                View view5 = helper.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "helper.itemView");
                textView4.setTextColor(view5.getResources().getColor(R.color.gl_text_color1));
            }
            View findViewById3 = view.findViewById(R.id.tem_tag_v);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById<View>(R.id.tem_tag_v)");
            findViewById3.setVisibility(dateItem.getSelected() ? 0 : 8);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.tracker.calender.GlCalendarAdapter$convert$$inlined$forEachIndexed$lambda$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    GlCalendarView glCalendarView;
                    glCalendarView = this.calendarView;
                    glCalendarView.selected(GlCalendarView.DateItem.this.getDate());
                }
            });
            i = i2;
        }
    }
}
