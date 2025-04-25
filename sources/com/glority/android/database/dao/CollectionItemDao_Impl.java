package com.glority.android.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.database.DataBaseConverter;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.SimpleCollectionItem;
import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class CollectionItemDao_Impl implements CollectionItemDao {
    private final DataBaseConverter __dataBaseConverter = new DataBaseConverter();
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<CollectionItem> __insertionAdapterOfCollectionItem;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public CollectionItemDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfCollectionItem = new EntityInsertionAdapter<CollectionItem>(__db) { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `CollectionItem` (`collectionId`,`uid`,`itemId`,`name`,`userId`,`imageUrl`,`date`,`number`,`acquisitionPrice`,`note`,`grade`,`priceUnit`,`year`,`mintMark`,`denominationSideUrl`,`subjectSideUrl`,`seriesIndexListUid`,`speciesUid`,`varietyUid`,`issuerCountryCode`,`issuer`,`customSeriesId`,`marketValue`,`mintage`,`denomination`,`compositionTypes`,`compositionOptions`,`mintMarkV2`,`subThemes`,`seriesList`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, CollectionItem value) {
                stmt.bindLong(1, value.getCollectionId());
                if (value.getUid() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getUid());
                }
                if (value.getItemId() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindLong(3, value.getItemId().longValue());
                }
                if (value.getName() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getName());
                }
                stmt.bindLong(5, value.getUserId());
                String listStringToString = CollectionItemDao_Impl.this.__dataBaseConverter.listStringToString(value.getImageUrl());
                if (listStringToString == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, listStringToString);
                }
                Long dateToLong = CollectionItemDao_Impl.this.__dataBaseConverter.dateToLong(value.getDate());
                if (dateToLong == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindLong(7, dateToLong.longValue());
                }
                if (value.getNumber() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getNumber());
                }
                if (value.getAcquisitionPrice() == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindDouble(9, value.getAcquisitionPrice().doubleValue());
                }
                if (value.getNote() == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.getNote());
                }
                if (value.getGrade() == null) {
                    stmt.bindNull(11);
                } else {
                    stmt.bindString(11, value.getGrade());
                }
                if (value.getPriceUnit() == null) {
                    stmt.bindNull(12);
                } else {
                    stmt.bindString(12, value.getPriceUnit());
                }
                if (value.getYear() == null) {
                    stmt.bindNull(13);
                } else {
                    stmt.bindString(13, value.getYear());
                }
                if (value.getMintMark() == null) {
                    stmt.bindNull(14);
                } else {
                    stmt.bindString(14, value.getMintMark());
                }
                if (value.getDenominationSideUrl() == null) {
                    stmt.bindNull(15);
                } else {
                    stmt.bindString(15, value.getDenominationSideUrl());
                }
                if (value.getSubjectSideUrl() == null) {
                    stmt.bindNull(16);
                } else {
                    stmt.bindString(16, value.getSubjectSideUrl());
                }
                if (value.getSeriesIndexListUid() == null) {
                    stmt.bindNull(17);
                } else {
                    stmt.bindString(17, value.getSeriesIndexListUid());
                }
                if (value.getSpeciesUid() == null) {
                    stmt.bindNull(18);
                } else {
                    stmt.bindString(18, value.getSpeciesUid());
                }
                if (value.getVarietyUid() == null) {
                    stmt.bindNull(19);
                } else {
                    stmt.bindString(19, value.getVarietyUid());
                }
                if (value.getIssuerCountryCode() == null) {
                    stmt.bindNull(20);
                } else {
                    stmt.bindString(20, value.getIssuerCountryCode());
                }
                if (value.getIssuer() == null) {
                    stmt.bindNull(21);
                } else {
                    stmt.bindString(21, value.getIssuer());
                }
                if (value.getCustomSeriesId() == null) {
                    stmt.bindNull(22);
                } else {
                    stmt.bindLong(22, value.getCustomSeriesId().intValue());
                }
                String priceToString = CollectionItemDao_Impl.this.__dataBaseConverter.priceToString(value.getMarketValue());
                if (priceToString == null) {
                    stmt.bindNull(23);
                } else {
                    stmt.bindString(23, priceToString);
                }
                if (value.getMintage() == null) {
                    stmt.bindNull(24);
                } else {
                    stmt.bindString(24, value.getMintage());
                }
                if (value.getDenomination() == null) {
                    stmt.bindNull(25);
                } else {
                    stmt.bindString(25, value.getDenomination());
                }
                String stringMutableListToString = CollectionItemDao_Impl.this.__dataBaseConverter.stringMutableListToString(value.getCompositionTypes());
                if (stringMutableListToString == null) {
                    stmt.bindNull(26);
                } else {
                    stmt.bindString(26, stringMutableListToString);
                }
                String stringMutableListToString2 = CollectionItemDao_Impl.this.__dataBaseConverter.stringMutableListToString(value.getCompositionOptions());
                if (stringMutableListToString2 == null) {
                    stmt.bindNull(27);
                } else {
                    stmt.bindString(27, stringMutableListToString2);
                }
                if (value.getMintMarkV2() == null) {
                    stmt.bindNull(28);
                } else {
                    stmt.bindString(28, value.getMintMarkV2());
                }
                String coinTagListToString = CollectionItemDao_Impl.this.__dataBaseConverter.coinTagListToString(value.getSubThemes());
                if (coinTagListToString == null) {
                    stmt.bindNull(29);
                } else {
                    stmt.bindString(29, coinTagListToString);
                }
                String coinTagListToString2 = CollectionItemDao_Impl.this.__dataBaseConverter.coinTagListToString(value.getSeriesList());
                if (coinTagListToString2 == null) {
                    stmt.bindNull(30);
                } else {
                    stmt.bindString(30, coinTagListToString2);
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM CollectionItem";
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM CollectionItem where collectionId=?";
            }
        };
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public void insert(final CollectionItem... collectionItem) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfCollectionItem.insert(collectionItem);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public void delete(final int collectionId) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        acquire.bindLong(1, collectionId);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public LiveData<List<CollectionItem>> getAll() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem order by collectionId desc", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"CollectionItem"}, false, new Callable<List<CollectionItem>>() { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.4
            @Override // java.util.concurrent.Callable
            public List<CollectionItem> call() throws Exception {
                String string;
                int i;
                String string2;
                int i2;
                String string3;
                int i3;
                String string4;
                int i4;
                String string5;
                int i5;
                String string6;
                int i6;
                String string7;
                int i7;
                String string8;
                int i8;
                String string9;
                int i9;
                String string10;
                int i10;
                String string11;
                int i11;
                Integer valueOf;
                int i12;
                String string12;
                int i13;
                String string13;
                int i14;
                String string14;
                int i15;
                String string15;
                String string16;
                String string17;
                int i16;
                int i17;
                String string18;
                int i18;
                String string19;
                Cursor query = DBUtil.query(CollectionItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
                    int i19 = columnIndexOrThrow13;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        int i20 = query.getInt(columnIndexOrThrow);
                        String string20 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        String string21 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        long j = query.getLong(columnIndexOrThrow5);
                        if (query.isNull(columnIndexOrThrow6)) {
                            i = columnIndexOrThrow;
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow6);
                            i = columnIndexOrThrow;
                        }
                        List<String> stringToStringMutableList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string);
                        if (stringToStringMutableList != null) {
                            Date longToDate = CollectionItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                            String string22 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                            String string23 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            String string24 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                            if (query.isNull(columnIndexOrThrow12)) {
                                i2 = i19;
                                string2 = null;
                            } else {
                                string2 = query.getString(columnIndexOrThrow12);
                                i2 = i19;
                            }
                            if (query.isNull(i2)) {
                                i3 = columnIndexOrThrow14;
                                string3 = null;
                            } else {
                                string3 = query.getString(i2);
                                i3 = columnIndexOrThrow14;
                            }
                            if (query.isNull(i3)) {
                                i19 = i2;
                                i4 = columnIndexOrThrow15;
                                string4 = null;
                            } else {
                                i19 = i2;
                                string4 = query.getString(i3);
                                i4 = columnIndexOrThrow15;
                            }
                            if (query.isNull(i4)) {
                                columnIndexOrThrow15 = i4;
                                i5 = columnIndexOrThrow16;
                                string5 = null;
                            } else {
                                columnIndexOrThrow15 = i4;
                                string5 = query.getString(i4);
                                i5 = columnIndexOrThrow16;
                            }
                            if (query.isNull(i5)) {
                                columnIndexOrThrow16 = i5;
                                i6 = columnIndexOrThrow17;
                                string6 = null;
                            } else {
                                columnIndexOrThrow16 = i5;
                                string6 = query.getString(i5);
                                i6 = columnIndexOrThrow17;
                            }
                            if (query.isNull(i6)) {
                                columnIndexOrThrow17 = i6;
                                i7 = columnIndexOrThrow18;
                                string7 = null;
                            } else {
                                columnIndexOrThrow17 = i6;
                                string7 = query.getString(i6);
                                i7 = columnIndexOrThrow18;
                            }
                            if (query.isNull(i7)) {
                                columnIndexOrThrow18 = i7;
                                i8 = columnIndexOrThrow19;
                                string8 = null;
                            } else {
                                columnIndexOrThrow18 = i7;
                                string8 = query.getString(i7);
                                i8 = columnIndexOrThrow19;
                            }
                            if (query.isNull(i8)) {
                                columnIndexOrThrow19 = i8;
                                i9 = columnIndexOrThrow20;
                                string9 = null;
                            } else {
                                columnIndexOrThrow19 = i8;
                                string9 = query.getString(i8);
                                i9 = columnIndexOrThrow20;
                            }
                            if (query.isNull(i9)) {
                                columnIndexOrThrow20 = i9;
                                i10 = columnIndexOrThrow21;
                                string10 = null;
                            } else {
                                columnIndexOrThrow20 = i9;
                                string10 = query.getString(i9);
                                i10 = columnIndexOrThrow21;
                            }
                            if (query.isNull(i10)) {
                                columnIndexOrThrow21 = i10;
                                i11 = columnIndexOrThrow22;
                                string11 = null;
                            } else {
                                columnIndexOrThrow21 = i10;
                                string11 = query.getString(i10);
                                i11 = columnIndexOrThrow22;
                            }
                            if (query.isNull(i11)) {
                                columnIndexOrThrow22 = i11;
                                i12 = columnIndexOrThrow23;
                                valueOf = null;
                            } else {
                                columnIndexOrThrow22 = i11;
                                valueOf = Integer.valueOf(query.getInt(i11));
                                i12 = columnIndexOrThrow23;
                            }
                            if (query.isNull(i12)) {
                                columnIndexOrThrow23 = i12;
                                i13 = columnIndexOrThrow2;
                                string12 = null;
                            } else {
                                columnIndexOrThrow23 = i12;
                                string12 = query.getString(i12);
                                i13 = columnIndexOrThrow2;
                            }
                            PriceValue stringToPrice = CollectionItemDao_Impl.this.__dataBaseConverter.stringToPrice(string12);
                            int i21 = columnIndexOrThrow24;
                            if (query.isNull(i21)) {
                                i14 = columnIndexOrThrow25;
                                string13 = null;
                            } else {
                                string13 = query.getString(i21);
                                i14 = columnIndexOrThrow25;
                            }
                            if (query.isNull(i14)) {
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                                string14 = null;
                            } else {
                                string14 = query.getString(i14);
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                            }
                            if (query.isNull(i15)) {
                                columnIndexOrThrow26 = i15;
                                columnIndexOrThrow25 = i14;
                                string15 = null;
                            } else {
                                columnIndexOrThrow26 = i15;
                                string15 = query.getString(i15);
                                columnIndexOrThrow25 = i14;
                            }
                            List<String> stringToStringMutableList2 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string15);
                            int i22 = columnIndexOrThrow27;
                            if (query.isNull(i22)) {
                                columnIndexOrThrow27 = i22;
                                string16 = null;
                            } else {
                                string16 = query.getString(i22);
                                columnIndexOrThrow27 = i22;
                            }
                            List<String> stringToStringMutableList3 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string16);
                            int i23 = columnIndexOrThrow28;
                            if (query.isNull(i23)) {
                                i16 = columnIndexOrThrow29;
                                string17 = null;
                            } else {
                                string17 = query.getString(i23);
                                i16 = columnIndexOrThrow29;
                            }
                            if (query.isNull(i16)) {
                                i17 = i23;
                                i18 = i16;
                                string18 = null;
                            } else {
                                i17 = i23;
                                string18 = query.getString(i16);
                                i18 = i16;
                            }
                            List<CoinTag> stringToCoinTagList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string18);
                            int i24 = columnIndexOrThrow30;
                            if (query.isNull(i24)) {
                                columnIndexOrThrow30 = i24;
                                string19 = null;
                            } else {
                                string19 = query.getString(i24);
                                columnIndexOrThrow30 = i24;
                            }
                            arrayList.add(new CollectionItem(i20, string20, valueOf2, string21, j, stringToStringMutableList, longToDate, string22, valueOf3, string23, string24, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, valueOf, stringToPrice, string13, string14, stringToStringMutableList2, stringToStringMutableList3, string17, stringToCoinTagList, CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string19)));
                            columnIndexOrThrow2 = i13;
                            columnIndexOrThrow = i;
                            columnIndexOrThrow14 = i3;
                            int i25 = i17;
                            columnIndexOrThrow29 = i18;
                            columnIndexOrThrow28 = i25;
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                        }
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public LiveData<List<CollectionItem>> getAllNoOrder(final long userId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=?", 1);
        acquire.bindLong(1, userId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"CollectionItem"}, false, new Callable<List<CollectionItem>>() { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List<CollectionItem> call() throws Exception {
                String string;
                int i;
                String string2;
                int i2;
                String string3;
                int i3;
                String string4;
                int i4;
                String string5;
                int i5;
                String string6;
                int i6;
                String string7;
                int i7;
                String string8;
                int i8;
                String string9;
                int i9;
                String string10;
                int i10;
                String string11;
                int i11;
                Integer valueOf;
                int i12;
                String string12;
                int i13;
                String string13;
                int i14;
                String string14;
                int i15;
                String string15;
                String string16;
                String string17;
                int i16;
                int i17;
                String string18;
                int i18;
                String string19;
                Cursor query = DBUtil.query(CollectionItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
                    int i19 = columnIndexOrThrow13;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        int i20 = query.getInt(columnIndexOrThrow);
                        String string20 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        String string21 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        long j = query.getLong(columnIndexOrThrow5);
                        if (query.isNull(columnIndexOrThrow6)) {
                            i = columnIndexOrThrow;
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow6);
                            i = columnIndexOrThrow;
                        }
                        List<String> stringToStringMutableList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string);
                        if (stringToStringMutableList != null) {
                            Date longToDate = CollectionItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                            String string22 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                            String string23 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            String string24 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                            if (query.isNull(columnIndexOrThrow12)) {
                                i2 = i19;
                                string2 = null;
                            } else {
                                string2 = query.getString(columnIndexOrThrow12);
                                i2 = i19;
                            }
                            if (query.isNull(i2)) {
                                i3 = columnIndexOrThrow14;
                                string3 = null;
                            } else {
                                string3 = query.getString(i2);
                                i3 = columnIndexOrThrow14;
                            }
                            if (query.isNull(i3)) {
                                i19 = i2;
                                i4 = columnIndexOrThrow15;
                                string4 = null;
                            } else {
                                i19 = i2;
                                string4 = query.getString(i3);
                                i4 = columnIndexOrThrow15;
                            }
                            if (query.isNull(i4)) {
                                columnIndexOrThrow15 = i4;
                                i5 = columnIndexOrThrow16;
                                string5 = null;
                            } else {
                                columnIndexOrThrow15 = i4;
                                string5 = query.getString(i4);
                                i5 = columnIndexOrThrow16;
                            }
                            if (query.isNull(i5)) {
                                columnIndexOrThrow16 = i5;
                                i6 = columnIndexOrThrow17;
                                string6 = null;
                            } else {
                                columnIndexOrThrow16 = i5;
                                string6 = query.getString(i5);
                                i6 = columnIndexOrThrow17;
                            }
                            if (query.isNull(i6)) {
                                columnIndexOrThrow17 = i6;
                                i7 = columnIndexOrThrow18;
                                string7 = null;
                            } else {
                                columnIndexOrThrow17 = i6;
                                string7 = query.getString(i6);
                                i7 = columnIndexOrThrow18;
                            }
                            if (query.isNull(i7)) {
                                columnIndexOrThrow18 = i7;
                                i8 = columnIndexOrThrow19;
                                string8 = null;
                            } else {
                                columnIndexOrThrow18 = i7;
                                string8 = query.getString(i7);
                                i8 = columnIndexOrThrow19;
                            }
                            if (query.isNull(i8)) {
                                columnIndexOrThrow19 = i8;
                                i9 = columnIndexOrThrow20;
                                string9 = null;
                            } else {
                                columnIndexOrThrow19 = i8;
                                string9 = query.getString(i8);
                                i9 = columnIndexOrThrow20;
                            }
                            if (query.isNull(i9)) {
                                columnIndexOrThrow20 = i9;
                                i10 = columnIndexOrThrow21;
                                string10 = null;
                            } else {
                                columnIndexOrThrow20 = i9;
                                string10 = query.getString(i9);
                                i10 = columnIndexOrThrow21;
                            }
                            if (query.isNull(i10)) {
                                columnIndexOrThrow21 = i10;
                                i11 = columnIndexOrThrow22;
                                string11 = null;
                            } else {
                                columnIndexOrThrow21 = i10;
                                string11 = query.getString(i10);
                                i11 = columnIndexOrThrow22;
                            }
                            if (query.isNull(i11)) {
                                columnIndexOrThrow22 = i11;
                                i12 = columnIndexOrThrow23;
                                valueOf = null;
                            } else {
                                columnIndexOrThrow22 = i11;
                                valueOf = Integer.valueOf(query.getInt(i11));
                                i12 = columnIndexOrThrow23;
                            }
                            if (query.isNull(i12)) {
                                columnIndexOrThrow23 = i12;
                                i13 = columnIndexOrThrow2;
                                string12 = null;
                            } else {
                                columnIndexOrThrow23 = i12;
                                string12 = query.getString(i12);
                                i13 = columnIndexOrThrow2;
                            }
                            PriceValue stringToPrice = CollectionItemDao_Impl.this.__dataBaseConverter.stringToPrice(string12);
                            int i21 = columnIndexOrThrow24;
                            if (query.isNull(i21)) {
                                i14 = columnIndexOrThrow25;
                                string13 = null;
                            } else {
                                string13 = query.getString(i21);
                                i14 = columnIndexOrThrow25;
                            }
                            if (query.isNull(i14)) {
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                                string14 = null;
                            } else {
                                string14 = query.getString(i14);
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                            }
                            if (query.isNull(i15)) {
                                columnIndexOrThrow26 = i15;
                                columnIndexOrThrow25 = i14;
                                string15 = null;
                            } else {
                                columnIndexOrThrow26 = i15;
                                string15 = query.getString(i15);
                                columnIndexOrThrow25 = i14;
                            }
                            List<String> stringToStringMutableList2 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string15);
                            int i22 = columnIndexOrThrow27;
                            if (query.isNull(i22)) {
                                columnIndexOrThrow27 = i22;
                                string16 = null;
                            } else {
                                string16 = query.getString(i22);
                                columnIndexOrThrow27 = i22;
                            }
                            List<String> stringToStringMutableList3 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string16);
                            int i23 = columnIndexOrThrow28;
                            if (query.isNull(i23)) {
                                i16 = columnIndexOrThrow29;
                                string17 = null;
                            } else {
                                string17 = query.getString(i23);
                                i16 = columnIndexOrThrow29;
                            }
                            if (query.isNull(i16)) {
                                i17 = i23;
                                i18 = i16;
                                string18 = null;
                            } else {
                                i17 = i23;
                                string18 = query.getString(i16);
                                i18 = i16;
                            }
                            List<CoinTag> stringToCoinTagList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string18);
                            int i24 = columnIndexOrThrow30;
                            if (query.isNull(i24)) {
                                columnIndexOrThrow30 = i24;
                                string19 = null;
                            } else {
                                string19 = query.getString(i24);
                                columnIndexOrThrow30 = i24;
                            }
                            arrayList.add(new CollectionItem(i20, string20, valueOf2, string21, j, stringToStringMutableList, longToDate, string22, valueOf3, string23, string24, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, valueOf, stringToPrice, string13, string14, stringToStringMutableList2, stringToStringMutableList3, string17, stringToCoinTagList, CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string19)));
                            columnIndexOrThrow2 = i13;
                            columnIndexOrThrow = i;
                            columnIndexOrThrow14 = i3;
                            int i25 = i17;
                            columnIndexOrThrow29 = i18;
                            columnIndexOrThrow28 = i25;
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                        }
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public LiveData<List<SimpleCollectionItem>> getAllSimpleItems() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select collectionId,uid,itemId from CollectionItem", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"CollectionItem"}, false, new Callable<List<SimpleCollectionItem>>() { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.6
            @Override // java.util.concurrent.Callable
            public List<SimpleCollectionItem> call() throws Exception {
                Cursor query = DBUtil.query(CollectionItemDao_Impl.this.__db, acquire, false, null);
                try {
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(new SimpleCollectionItem(query.getInt(0), query.isNull(1) ? null : query.getString(1), query.isNull(2) ? null : Long.valueOf(query.getLong(2))));
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public LiveData<List<CollectionItem>> getAllByIndexListUid(final long userId, final String indexListUid) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=? and seriesIndexListUid =? order by collectionId desc", 2);
        acquire.bindLong(1, userId);
        if (indexListUid == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, indexListUid);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"CollectionItem"}, false, new Callable<List<CollectionItem>>() { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<CollectionItem> call() throws Exception {
                String string;
                int i;
                String string2;
                int i2;
                String string3;
                int i3;
                String string4;
                int i4;
                String string5;
                int i5;
                String string6;
                int i6;
                String string7;
                int i7;
                String string8;
                int i8;
                String string9;
                int i9;
                String string10;
                int i10;
                String string11;
                int i11;
                Integer valueOf;
                int i12;
                String string12;
                int i13;
                String string13;
                int i14;
                String string14;
                int i15;
                String string15;
                String string16;
                String string17;
                int i16;
                int i17;
                String string18;
                int i18;
                String string19;
                Cursor query = DBUtil.query(CollectionItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
                    int i19 = columnIndexOrThrow13;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        int i20 = query.getInt(columnIndexOrThrow);
                        String string20 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        String string21 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        long j = query.getLong(columnIndexOrThrow5);
                        if (query.isNull(columnIndexOrThrow6)) {
                            i = columnIndexOrThrow;
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow6);
                            i = columnIndexOrThrow;
                        }
                        List<String> stringToStringMutableList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string);
                        if (stringToStringMutableList != null) {
                            Date longToDate = CollectionItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                            String string22 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                            String string23 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            String string24 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                            if (query.isNull(columnIndexOrThrow12)) {
                                i2 = i19;
                                string2 = null;
                            } else {
                                string2 = query.getString(columnIndexOrThrow12);
                                i2 = i19;
                            }
                            if (query.isNull(i2)) {
                                i3 = columnIndexOrThrow14;
                                string3 = null;
                            } else {
                                string3 = query.getString(i2);
                                i3 = columnIndexOrThrow14;
                            }
                            if (query.isNull(i3)) {
                                i19 = i2;
                                i4 = columnIndexOrThrow15;
                                string4 = null;
                            } else {
                                i19 = i2;
                                string4 = query.getString(i3);
                                i4 = columnIndexOrThrow15;
                            }
                            if (query.isNull(i4)) {
                                columnIndexOrThrow15 = i4;
                                i5 = columnIndexOrThrow16;
                                string5 = null;
                            } else {
                                columnIndexOrThrow15 = i4;
                                string5 = query.getString(i4);
                                i5 = columnIndexOrThrow16;
                            }
                            if (query.isNull(i5)) {
                                columnIndexOrThrow16 = i5;
                                i6 = columnIndexOrThrow17;
                                string6 = null;
                            } else {
                                columnIndexOrThrow16 = i5;
                                string6 = query.getString(i5);
                                i6 = columnIndexOrThrow17;
                            }
                            if (query.isNull(i6)) {
                                columnIndexOrThrow17 = i6;
                                i7 = columnIndexOrThrow18;
                                string7 = null;
                            } else {
                                columnIndexOrThrow17 = i6;
                                string7 = query.getString(i6);
                                i7 = columnIndexOrThrow18;
                            }
                            if (query.isNull(i7)) {
                                columnIndexOrThrow18 = i7;
                                i8 = columnIndexOrThrow19;
                                string8 = null;
                            } else {
                                columnIndexOrThrow18 = i7;
                                string8 = query.getString(i7);
                                i8 = columnIndexOrThrow19;
                            }
                            if (query.isNull(i8)) {
                                columnIndexOrThrow19 = i8;
                                i9 = columnIndexOrThrow20;
                                string9 = null;
                            } else {
                                columnIndexOrThrow19 = i8;
                                string9 = query.getString(i8);
                                i9 = columnIndexOrThrow20;
                            }
                            if (query.isNull(i9)) {
                                columnIndexOrThrow20 = i9;
                                i10 = columnIndexOrThrow21;
                                string10 = null;
                            } else {
                                columnIndexOrThrow20 = i9;
                                string10 = query.getString(i9);
                                i10 = columnIndexOrThrow21;
                            }
                            if (query.isNull(i10)) {
                                columnIndexOrThrow21 = i10;
                                i11 = columnIndexOrThrow22;
                                string11 = null;
                            } else {
                                columnIndexOrThrow21 = i10;
                                string11 = query.getString(i10);
                                i11 = columnIndexOrThrow22;
                            }
                            if (query.isNull(i11)) {
                                columnIndexOrThrow22 = i11;
                                i12 = columnIndexOrThrow23;
                                valueOf = null;
                            } else {
                                columnIndexOrThrow22 = i11;
                                valueOf = Integer.valueOf(query.getInt(i11));
                                i12 = columnIndexOrThrow23;
                            }
                            if (query.isNull(i12)) {
                                columnIndexOrThrow23 = i12;
                                i13 = columnIndexOrThrow2;
                                string12 = null;
                            } else {
                                columnIndexOrThrow23 = i12;
                                string12 = query.getString(i12);
                                i13 = columnIndexOrThrow2;
                            }
                            PriceValue stringToPrice = CollectionItemDao_Impl.this.__dataBaseConverter.stringToPrice(string12);
                            int i21 = columnIndexOrThrow24;
                            if (query.isNull(i21)) {
                                i14 = columnIndexOrThrow25;
                                string13 = null;
                            } else {
                                string13 = query.getString(i21);
                                i14 = columnIndexOrThrow25;
                            }
                            if (query.isNull(i14)) {
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                                string14 = null;
                            } else {
                                string14 = query.getString(i14);
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                            }
                            if (query.isNull(i15)) {
                                columnIndexOrThrow26 = i15;
                                columnIndexOrThrow25 = i14;
                                string15 = null;
                            } else {
                                columnIndexOrThrow26 = i15;
                                string15 = query.getString(i15);
                                columnIndexOrThrow25 = i14;
                            }
                            List<String> stringToStringMutableList2 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string15);
                            int i22 = columnIndexOrThrow27;
                            if (query.isNull(i22)) {
                                columnIndexOrThrow27 = i22;
                                string16 = null;
                            } else {
                                string16 = query.getString(i22);
                                columnIndexOrThrow27 = i22;
                            }
                            List<String> stringToStringMutableList3 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string16);
                            int i23 = columnIndexOrThrow28;
                            if (query.isNull(i23)) {
                                i16 = columnIndexOrThrow29;
                                string17 = null;
                            } else {
                                string17 = query.getString(i23);
                                i16 = columnIndexOrThrow29;
                            }
                            if (query.isNull(i16)) {
                                i17 = i23;
                                i18 = i16;
                                string18 = null;
                            } else {
                                i17 = i23;
                                string18 = query.getString(i16);
                                i18 = i16;
                            }
                            List<CoinTag> stringToCoinTagList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string18);
                            int i24 = columnIndexOrThrow30;
                            if (query.isNull(i24)) {
                                columnIndexOrThrow30 = i24;
                                string19 = null;
                            } else {
                                string19 = query.getString(i24);
                                columnIndexOrThrow30 = i24;
                            }
                            arrayList.add(new CollectionItem(i20, string20, valueOf2, string21, j, stringToStringMutableList, longToDate, string22, valueOf3, string23, string24, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, valueOf, stringToPrice, string13, string14, stringToStringMutableList2, stringToStringMutableList3, string17, stringToCoinTagList, CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string19)));
                            columnIndexOrThrow2 = i13;
                            columnIndexOrThrow = i;
                            columnIndexOrThrow14 = i3;
                            int i25 = i17;
                            columnIndexOrThrow29 = i18;
                            columnIndexOrThrow28 = i25;
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                        }
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public List<CollectionItem> getAllByIndexListUidSync(final long userId, final String indexListUid) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        String string4;
        int i4;
        String str;
        String string5;
        int i5;
        String string6;
        int i6;
        String string7;
        int i7;
        String string8;
        int i8;
        String string9;
        int i9;
        String string10;
        int i10;
        Integer valueOf;
        int i11;
        int i12;
        String string11;
        int i13;
        String string12;
        int i14;
        String string13;
        int i15;
        String string14;
        String string15;
        String string16;
        int i16;
        int i17;
        String string17;
        int i18;
        String string18;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=? and seriesIndexListUid =? order by collectionId desc", 2);
        acquire.bindLong(1, userId);
        if (indexListUid == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, indexListUid);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
            int i19 = columnIndexOrThrow13;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i20 = query.getInt(columnIndexOrThrow);
                String string19 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                String string20 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                long j = query.getLong(columnIndexOrThrow5);
                if (query.isNull(columnIndexOrThrow6)) {
                    i = columnIndexOrThrow;
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow6);
                    i = columnIndexOrThrow;
                }
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(string);
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                String string21 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                String string22 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                String string23 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                if (query.isNull(columnIndexOrThrow12)) {
                    i2 = i19;
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow12);
                    i2 = i19;
                }
                if (query.isNull(i2)) {
                    i3 = columnIndexOrThrow14;
                    string3 = null;
                } else {
                    string3 = query.getString(i2);
                    i3 = columnIndexOrThrow14;
                }
                if (query.isNull(i3)) {
                    i19 = i2;
                    string4 = null;
                } else {
                    string4 = query.getString(i3);
                    i19 = i2;
                }
                int i21 = columnIndexOrThrow15;
                if (query.isNull(i21)) {
                    columnIndexOrThrow15 = i21;
                    i4 = columnIndexOrThrow16;
                    str = null;
                } else {
                    String string24 = query.getString(i21);
                    columnIndexOrThrow15 = i21;
                    i4 = columnIndexOrThrow16;
                    str = string24;
                }
                if (query.isNull(i4)) {
                    columnIndexOrThrow16 = i4;
                    i5 = columnIndexOrThrow17;
                    string5 = null;
                } else {
                    string5 = query.getString(i4);
                    columnIndexOrThrow16 = i4;
                    i5 = columnIndexOrThrow17;
                }
                if (query.isNull(i5)) {
                    columnIndexOrThrow17 = i5;
                    i6 = columnIndexOrThrow18;
                    string6 = null;
                } else {
                    string6 = query.getString(i5);
                    columnIndexOrThrow17 = i5;
                    i6 = columnIndexOrThrow18;
                }
                if (query.isNull(i6)) {
                    columnIndexOrThrow18 = i6;
                    i7 = columnIndexOrThrow19;
                    string7 = null;
                } else {
                    string7 = query.getString(i6);
                    columnIndexOrThrow18 = i6;
                    i7 = columnIndexOrThrow19;
                }
                if (query.isNull(i7)) {
                    columnIndexOrThrow19 = i7;
                    i8 = columnIndexOrThrow20;
                    string8 = null;
                } else {
                    string8 = query.getString(i7);
                    columnIndexOrThrow19 = i7;
                    i8 = columnIndexOrThrow20;
                }
                if (query.isNull(i8)) {
                    columnIndexOrThrow20 = i8;
                    i9 = columnIndexOrThrow21;
                    string9 = null;
                } else {
                    string9 = query.getString(i8);
                    columnIndexOrThrow20 = i8;
                    i9 = columnIndexOrThrow21;
                }
                if (query.isNull(i9)) {
                    columnIndexOrThrow21 = i9;
                    i10 = columnIndexOrThrow22;
                    string10 = null;
                } else {
                    string10 = query.getString(i9);
                    columnIndexOrThrow21 = i9;
                    i10 = columnIndexOrThrow22;
                }
                if (query.isNull(i10)) {
                    columnIndexOrThrow22 = i10;
                    i11 = columnIndexOrThrow23;
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(i10));
                    columnIndexOrThrow22 = i10;
                    i11 = columnIndexOrThrow23;
                }
                if (query.isNull(i11)) {
                    i12 = i11;
                    i13 = i3;
                    string11 = null;
                } else {
                    i12 = i11;
                    string11 = query.getString(i11);
                    i13 = i3;
                }
                PriceValue stringToPrice = this.__dataBaseConverter.stringToPrice(string11);
                int i22 = columnIndexOrThrow24;
                if (query.isNull(i22)) {
                    i14 = columnIndexOrThrow25;
                    string12 = null;
                } else {
                    string12 = query.getString(i22);
                    i14 = columnIndexOrThrow25;
                }
                if (query.isNull(i14)) {
                    columnIndexOrThrow24 = i22;
                    i15 = columnIndexOrThrow26;
                    string13 = null;
                } else {
                    string13 = query.getString(i14);
                    columnIndexOrThrow24 = i22;
                    i15 = columnIndexOrThrow26;
                }
                if (query.isNull(i15)) {
                    columnIndexOrThrow26 = i15;
                    columnIndexOrThrow25 = i14;
                    string14 = null;
                } else {
                    columnIndexOrThrow26 = i15;
                    string14 = query.getString(i15);
                    columnIndexOrThrow25 = i14;
                }
                List<String> stringToStringMutableList2 = this.__dataBaseConverter.stringToStringMutableList(string14);
                int i23 = columnIndexOrThrow27;
                if (query.isNull(i23)) {
                    columnIndexOrThrow27 = i23;
                    string15 = null;
                } else {
                    string15 = query.getString(i23);
                    columnIndexOrThrow27 = i23;
                }
                List<String> stringToStringMutableList3 = this.__dataBaseConverter.stringToStringMutableList(string15);
                int i24 = columnIndexOrThrow28;
                if (query.isNull(i24)) {
                    i16 = columnIndexOrThrow29;
                    string16 = null;
                } else {
                    string16 = query.getString(i24);
                    i16 = columnIndexOrThrow29;
                }
                if (query.isNull(i16)) {
                    i17 = i24;
                    i18 = i16;
                    string17 = null;
                } else {
                    i17 = i24;
                    string17 = query.getString(i16);
                    i18 = i16;
                }
                List<CoinTag> stringToCoinTagList = this.__dataBaseConverter.stringToCoinTagList(string17);
                int i25 = columnIndexOrThrow30;
                if (query.isNull(i25)) {
                    columnIndexOrThrow30 = i25;
                    string18 = null;
                } else {
                    string18 = query.getString(i25);
                    columnIndexOrThrow30 = i25;
                }
                arrayList.add(new CollectionItem(i20, string19, valueOf2, string20, j, stringToStringMutableList, longToDate, string21, valueOf3, string22, string23, string2, string3, string4, str, string5, string6, string7, string8, string9, string10, valueOf, stringToPrice, string12, string13, stringToStringMutableList2, stringToStringMutableList3, string16, stringToCoinTagList, this.__dataBaseConverter.stringToCoinTagList(string18)));
                columnIndexOrThrow = i;
                int i26 = i13;
                columnIndexOrThrow23 = i12;
                columnIndexOrThrow14 = i26;
                int i27 = i17;
                columnIndexOrThrow29 = i18;
                columnIndexOrThrow28 = i27;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public List<CollectionItem> getAllSync(final long userId) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        String string4;
        int i4;
        String string5;
        int i5;
        String string6;
        int i6;
        String string7;
        int i7;
        String string8;
        int i8;
        String string9;
        int i9;
        String string10;
        int i10;
        String string11;
        int i11;
        Integer valueOf;
        int i12;
        int i13;
        String string12;
        int i14;
        String string13;
        int i15;
        String string14;
        int i16;
        String string15;
        String string16;
        String string17;
        int i17;
        int i18;
        String string18;
        int i19;
        String string19;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=?", 1);
        acquire.bindLong(1, userId);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
            int i20 = columnIndexOrThrow13;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i21 = query.getInt(columnIndexOrThrow);
                String string20 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                String string21 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                long j = query.getLong(columnIndexOrThrow5);
                if (query.isNull(columnIndexOrThrow6)) {
                    i = columnIndexOrThrow;
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow6);
                    i = columnIndexOrThrow;
                }
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(string);
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                String string22 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                String string23 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                String string24 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                if (query.isNull(columnIndexOrThrow12)) {
                    i2 = i20;
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow12);
                    i2 = i20;
                }
                if (query.isNull(i2)) {
                    i3 = columnIndexOrThrow14;
                    string3 = null;
                } else {
                    string3 = query.getString(i2);
                    i3 = columnIndexOrThrow14;
                }
                if (query.isNull(i3)) {
                    i20 = i2;
                    i4 = columnIndexOrThrow15;
                    string4 = null;
                } else {
                    string4 = query.getString(i3);
                    i20 = i2;
                    i4 = columnIndexOrThrow15;
                }
                if (query.isNull(i4)) {
                    columnIndexOrThrow15 = i4;
                    i5 = columnIndexOrThrow16;
                    string5 = null;
                } else {
                    string5 = query.getString(i4);
                    columnIndexOrThrow15 = i4;
                    i5 = columnIndexOrThrow16;
                }
                if (query.isNull(i5)) {
                    columnIndexOrThrow16 = i5;
                    i6 = columnIndexOrThrow17;
                    string6 = null;
                } else {
                    string6 = query.getString(i5);
                    columnIndexOrThrow16 = i5;
                    i6 = columnIndexOrThrow17;
                }
                if (query.isNull(i6)) {
                    columnIndexOrThrow17 = i6;
                    i7 = columnIndexOrThrow18;
                    string7 = null;
                } else {
                    string7 = query.getString(i6);
                    columnIndexOrThrow17 = i6;
                    i7 = columnIndexOrThrow18;
                }
                if (query.isNull(i7)) {
                    columnIndexOrThrow18 = i7;
                    i8 = columnIndexOrThrow19;
                    string8 = null;
                } else {
                    string8 = query.getString(i7);
                    columnIndexOrThrow18 = i7;
                    i8 = columnIndexOrThrow19;
                }
                if (query.isNull(i8)) {
                    columnIndexOrThrow19 = i8;
                    i9 = columnIndexOrThrow20;
                    string9 = null;
                } else {
                    string9 = query.getString(i8);
                    columnIndexOrThrow19 = i8;
                    i9 = columnIndexOrThrow20;
                }
                if (query.isNull(i9)) {
                    columnIndexOrThrow20 = i9;
                    i10 = columnIndexOrThrow21;
                    string10 = null;
                } else {
                    string10 = query.getString(i9);
                    columnIndexOrThrow20 = i9;
                    i10 = columnIndexOrThrow21;
                }
                if (query.isNull(i10)) {
                    columnIndexOrThrow21 = i10;
                    i11 = columnIndexOrThrow22;
                    string11 = null;
                } else {
                    string11 = query.getString(i10);
                    columnIndexOrThrow21 = i10;
                    i11 = columnIndexOrThrow22;
                }
                if (query.isNull(i11)) {
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(i11));
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                }
                if (query.isNull(i12)) {
                    i13 = i12;
                    i14 = i3;
                    string12 = null;
                } else {
                    i13 = i12;
                    string12 = query.getString(i12);
                    i14 = i3;
                }
                PriceValue stringToPrice = this.__dataBaseConverter.stringToPrice(string12);
                int i22 = columnIndexOrThrow24;
                if (query.isNull(i22)) {
                    i15 = columnIndexOrThrow25;
                    string13 = null;
                } else {
                    string13 = query.getString(i22);
                    i15 = columnIndexOrThrow25;
                }
                if (query.isNull(i15)) {
                    columnIndexOrThrow24 = i22;
                    i16 = columnIndexOrThrow26;
                    string14 = null;
                } else {
                    string14 = query.getString(i15);
                    columnIndexOrThrow24 = i22;
                    i16 = columnIndexOrThrow26;
                }
                if (query.isNull(i16)) {
                    columnIndexOrThrow26 = i16;
                    columnIndexOrThrow25 = i15;
                    string15 = null;
                } else {
                    columnIndexOrThrow26 = i16;
                    string15 = query.getString(i16);
                    columnIndexOrThrow25 = i15;
                }
                List<String> stringToStringMutableList2 = this.__dataBaseConverter.stringToStringMutableList(string15);
                int i23 = columnIndexOrThrow27;
                if (query.isNull(i23)) {
                    columnIndexOrThrow27 = i23;
                    string16 = null;
                } else {
                    string16 = query.getString(i23);
                    columnIndexOrThrow27 = i23;
                }
                List<String> stringToStringMutableList3 = this.__dataBaseConverter.stringToStringMutableList(string16);
                int i24 = columnIndexOrThrow28;
                if (query.isNull(i24)) {
                    i17 = columnIndexOrThrow29;
                    string17 = null;
                } else {
                    string17 = query.getString(i24);
                    i17 = columnIndexOrThrow29;
                }
                if (query.isNull(i17)) {
                    i18 = i24;
                    i19 = i17;
                    string18 = null;
                } else {
                    i18 = i24;
                    string18 = query.getString(i17);
                    i19 = i17;
                }
                List<CoinTag> stringToCoinTagList = this.__dataBaseConverter.stringToCoinTagList(string18);
                int i25 = columnIndexOrThrow30;
                if (query.isNull(i25)) {
                    columnIndexOrThrow30 = i25;
                    string19 = null;
                } else {
                    string19 = query.getString(i25);
                    columnIndexOrThrow30 = i25;
                }
                arrayList.add(new CollectionItem(i21, string20, valueOf2, string21, j, stringToStringMutableList, longToDate, string22, valueOf3, string23, string24, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, valueOf, stringToPrice, string13, string14, stringToStringMutableList2, stringToStringMutableList3, string17, stringToCoinTagList, this.__dataBaseConverter.stringToCoinTagList(string19)));
                columnIndexOrThrow = i;
                int i26 = i14;
                columnIndexOrThrow23 = i13;
                columnIndexOrThrow14 = i26;
                int i27 = i18;
                columnIndexOrThrow29 = i19;
                columnIndexOrThrow28 = i27;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public LiveData<CollectionItem> getItem(final int collectionId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where collectionId=?", 1);
        acquire.bindLong(1, collectionId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"CollectionItem"}, false, new Callable<CollectionItem>() { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CollectionItem call() throws Exception {
                CollectionItem collectionItem;
                String string;
                int i;
                String string2;
                int i2;
                String string3;
                int i3;
                String string4;
                int i4;
                String string5;
                int i5;
                String string6;
                int i6;
                String string7;
                int i7;
                String string8;
                int i8;
                String string9;
                int i9;
                Integer valueOf;
                int i10;
                String string10;
                int i11;
                String string11;
                int i12;
                String string12;
                int i13;
                Cursor query = DBUtil.query(CollectionItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
                    if (query.moveToFirst()) {
                        int i14 = query.getInt(columnIndexOrThrow);
                        String string13 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        String string14 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        long j = query.getLong(columnIndexOrThrow5);
                        List<String> stringToStringMutableList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                        if (stringToStringMutableList != null) {
                            Date longToDate = CollectionItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                            String string15 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                            String string16 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            String string17 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                            String string18 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                            if (query.isNull(columnIndexOrThrow13)) {
                                i = columnIndexOrThrow14;
                                string = null;
                            } else {
                                string = query.getString(columnIndexOrThrow13);
                                i = columnIndexOrThrow14;
                            }
                            if (query.isNull(i)) {
                                i2 = columnIndexOrThrow15;
                                string2 = null;
                            } else {
                                string2 = query.getString(i);
                                i2 = columnIndexOrThrow15;
                            }
                            if (query.isNull(i2)) {
                                i3 = columnIndexOrThrow16;
                                string3 = null;
                            } else {
                                string3 = query.getString(i2);
                                i3 = columnIndexOrThrow16;
                            }
                            if (query.isNull(i3)) {
                                i4 = columnIndexOrThrow17;
                                string4 = null;
                            } else {
                                string4 = query.getString(i3);
                                i4 = columnIndexOrThrow17;
                            }
                            if (query.isNull(i4)) {
                                i5 = columnIndexOrThrow18;
                                string5 = null;
                            } else {
                                string5 = query.getString(i4);
                                i5 = columnIndexOrThrow18;
                            }
                            if (query.isNull(i5)) {
                                i6 = columnIndexOrThrow19;
                                string6 = null;
                            } else {
                                string6 = query.getString(i5);
                                i6 = columnIndexOrThrow19;
                            }
                            if (query.isNull(i6)) {
                                i7 = columnIndexOrThrow20;
                                string7 = null;
                            } else {
                                string7 = query.getString(i6);
                                i7 = columnIndexOrThrow20;
                            }
                            if (query.isNull(i7)) {
                                i8 = columnIndexOrThrow21;
                                string8 = null;
                            } else {
                                string8 = query.getString(i7);
                                i8 = columnIndexOrThrow21;
                            }
                            if (query.isNull(i8)) {
                                i9 = columnIndexOrThrow22;
                                string9 = null;
                            } else {
                                string9 = query.getString(i8);
                                i9 = columnIndexOrThrow22;
                            }
                            if (query.isNull(i9)) {
                                i10 = columnIndexOrThrow23;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(query.getInt(i9));
                                i10 = columnIndexOrThrow23;
                            }
                            PriceValue stringToPrice = CollectionItemDao_Impl.this.__dataBaseConverter.stringToPrice(query.isNull(i10) ? null : query.getString(i10));
                            if (query.isNull(columnIndexOrThrow24)) {
                                i11 = columnIndexOrThrow25;
                                string10 = null;
                            } else {
                                string10 = query.getString(columnIndexOrThrow24);
                                i11 = columnIndexOrThrow25;
                            }
                            if (query.isNull(i11)) {
                                i12 = columnIndexOrThrow26;
                                string11 = null;
                            } else {
                                string11 = query.getString(i11);
                                i12 = columnIndexOrThrow26;
                            }
                            List<String> stringToStringMutableList2 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(i12) ? null : query.getString(i12));
                            List<String> stringToStringMutableList3 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow27) ? null : query.getString(columnIndexOrThrow27));
                            if (query.isNull(columnIndexOrThrow28)) {
                                i13 = columnIndexOrThrow29;
                                string12 = null;
                            } else {
                                string12 = query.getString(columnIndexOrThrow28);
                                i13 = columnIndexOrThrow29;
                            }
                            collectionItem = new CollectionItem(i14, string13, valueOf2, string14, j, stringToStringMutableList, longToDate, string15, valueOf3, string16, string17, string18, string, string2, string3, string4, string5, string6, string7, string8, string9, valueOf, stringToPrice, string10, string11, stringToStringMutableList2, stringToStringMutableList3, string12, CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(query.isNull(i13) ? null : query.getString(i13)), CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(query.isNull(columnIndexOrThrow30) ? null : query.getString(columnIndexOrThrow30)));
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                        }
                    } else {
                        collectionItem = null;
                    }
                    return collectionItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public List<CollectionItem> getItemsSync(final String uid) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        String string4;
        int i4;
        String string5;
        int i5;
        String string6;
        int i6;
        String string7;
        int i7;
        String string8;
        int i8;
        String string9;
        int i9;
        String string10;
        int i10;
        String string11;
        int i11;
        Integer valueOf;
        int i12;
        String string12;
        String string13;
        int i13;
        String string14;
        int i14;
        String string15;
        String string16;
        String string17;
        int i15;
        int i16;
        String string18;
        int i17;
        String string19;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where uid=? or varietyUid=?", 2);
        if (uid == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, uid);
        }
        if (uid == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, uid);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
            int i18 = columnIndexOrThrow13;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i19 = query.getInt(columnIndexOrThrow);
                String string20 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                String string21 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                long j = query.getLong(columnIndexOrThrow5);
                if (query.isNull(columnIndexOrThrow6)) {
                    i = columnIndexOrThrow;
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow6);
                    i = columnIndexOrThrow;
                }
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(string);
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                String string22 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                String string23 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                String string24 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                if (query.isNull(columnIndexOrThrow12)) {
                    i2 = i18;
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow12);
                    i2 = i18;
                }
                if (query.isNull(i2)) {
                    i3 = columnIndexOrThrow14;
                    string3 = null;
                } else {
                    string3 = query.getString(i2);
                    i3 = columnIndexOrThrow14;
                }
                if (query.isNull(i3)) {
                    i18 = i2;
                    i4 = columnIndexOrThrow15;
                    string4 = null;
                } else {
                    i18 = i2;
                    string4 = query.getString(i3);
                    i4 = columnIndexOrThrow15;
                }
                if (query.isNull(i4)) {
                    columnIndexOrThrow15 = i4;
                    i5 = columnIndexOrThrow16;
                    string5 = null;
                } else {
                    columnIndexOrThrow15 = i4;
                    string5 = query.getString(i4);
                    i5 = columnIndexOrThrow16;
                }
                if (query.isNull(i5)) {
                    columnIndexOrThrow16 = i5;
                    i6 = columnIndexOrThrow17;
                    string6 = null;
                } else {
                    columnIndexOrThrow16 = i5;
                    string6 = query.getString(i5);
                    i6 = columnIndexOrThrow17;
                }
                if (query.isNull(i6)) {
                    columnIndexOrThrow17 = i6;
                    i7 = columnIndexOrThrow18;
                    string7 = null;
                } else {
                    columnIndexOrThrow17 = i6;
                    string7 = query.getString(i6);
                    i7 = columnIndexOrThrow18;
                }
                if (query.isNull(i7)) {
                    columnIndexOrThrow18 = i7;
                    i8 = columnIndexOrThrow19;
                    string8 = null;
                } else {
                    columnIndexOrThrow18 = i7;
                    string8 = query.getString(i7);
                    i8 = columnIndexOrThrow19;
                }
                if (query.isNull(i8)) {
                    columnIndexOrThrow19 = i8;
                    i9 = columnIndexOrThrow20;
                    string9 = null;
                } else {
                    columnIndexOrThrow19 = i8;
                    string9 = query.getString(i8);
                    i9 = columnIndexOrThrow20;
                }
                if (query.isNull(i9)) {
                    columnIndexOrThrow20 = i9;
                    i10 = columnIndexOrThrow21;
                    string10 = null;
                } else {
                    columnIndexOrThrow20 = i9;
                    string10 = query.getString(i9);
                    i10 = columnIndexOrThrow21;
                }
                if (query.isNull(i10)) {
                    columnIndexOrThrow21 = i10;
                    i11 = columnIndexOrThrow22;
                    string11 = null;
                } else {
                    columnIndexOrThrow21 = i10;
                    string11 = query.getString(i10);
                    i11 = columnIndexOrThrow22;
                }
                if (query.isNull(i11)) {
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                    valueOf = null;
                } else {
                    columnIndexOrThrow22 = i11;
                    valueOf = Integer.valueOf(query.getInt(i11));
                    i12 = columnIndexOrThrow23;
                }
                if (query.isNull(i12)) {
                    columnIndexOrThrow23 = i12;
                    columnIndexOrThrow14 = i3;
                    string12 = null;
                } else {
                    columnIndexOrThrow23 = i12;
                    string12 = query.getString(i12);
                    columnIndexOrThrow14 = i3;
                }
                PriceValue stringToPrice = this.__dataBaseConverter.stringToPrice(string12);
                int i20 = columnIndexOrThrow24;
                if (query.isNull(i20)) {
                    i13 = columnIndexOrThrow25;
                    string13 = null;
                } else {
                    string13 = query.getString(i20);
                    i13 = columnIndexOrThrow25;
                }
                if (query.isNull(i13)) {
                    columnIndexOrThrow24 = i20;
                    i14 = columnIndexOrThrow26;
                    string14 = null;
                } else {
                    string14 = query.getString(i13);
                    columnIndexOrThrow24 = i20;
                    i14 = columnIndexOrThrow26;
                }
                if (query.isNull(i14)) {
                    columnIndexOrThrow26 = i14;
                    columnIndexOrThrow25 = i13;
                    string15 = null;
                } else {
                    columnIndexOrThrow26 = i14;
                    string15 = query.getString(i14);
                    columnIndexOrThrow25 = i13;
                }
                List<String> stringToStringMutableList2 = this.__dataBaseConverter.stringToStringMutableList(string15);
                int i21 = columnIndexOrThrow27;
                if (query.isNull(i21)) {
                    columnIndexOrThrow27 = i21;
                    string16 = null;
                } else {
                    string16 = query.getString(i21);
                    columnIndexOrThrow27 = i21;
                }
                List<String> stringToStringMutableList3 = this.__dataBaseConverter.stringToStringMutableList(string16);
                int i22 = columnIndexOrThrow28;
                if (query.isNull(i22)) {
                    i15 = columnIndexOrThrow29;
                    string17 = null;
                } else {
                    string17 = query.getString(i22);
                    i15 = columnIndexOrThrow29;
                }
                if (query.isNull(i15)) {
                    i16 = i22;
                    i17 = i15;
                    string18 = null;
                } else {
                    i16 = i22;
                    string18 = query.getString(i15);
                    i17 = i15;
                }
                List<CoinTag> stringToCoinTagList = this.__dataBaseConverter.stringToCoinTagList(string18);
                int i23 = columnIndexOrThrow30;
                if (query.isNull(i23)) {
                    columnIndexOrThrow30 = i23;
                    string19 = null;
                } else {
                    string19 = query.getString(i23);
                    columnIndexOrThrow30 = i23;
                }
                arrayList.add(new CollectionItem(i19, string20, valueOf2, string21, j, stringToStringMutableList, longToDate, string22, valueOf3, string23, string24, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, valueOf, stringToPrice, string13, string14, stringToStringMutableList2, stringToStringMutableList3, string17, stringToCoinTagList, this.__dataBaseConverter.stringToCoinTagList(string19)));
                columnIndexOrThrow = i;
                int i24 = i16;
                columnIndexOrThrow29 = i17;
                columnIndexOrThrow28 = i24;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public LiveData<List<CollectionItem>> getItems(final String uid) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where uid=? or varietyUid=? or speciesUid=? order by collectionId desc", 3);
        if (uid == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, uid);
        }
        if (uid == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, uid);
        }
        if (uid == null) {
            acquire.bindNull(3);
        } else {
            acquire.bindString(3, uid);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"CollectionItem"}, false, new Callable<List<CollectionItem>>() { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<CollectionItem> call() throws Exception {
                String string;
                int i;
                String string2;
                int i2;
                String string3;
                int i3;
                String string4;
                int i4;
                String string5;
                int i5;
                String string6;
                int i6;
                String string7;
                int i7;
                String string8;
                int i8;
                String string9;
                int i9;
                String string10;
                int i10;
                String string11;
                int i11;
                Integer valueOf;
                int i12;
                String string12;
                int i13;
                String string13;
                int i14;
                String string14;
                int i15;
                String string15;
                String string16;
                String string17;
                int i16;
                int i17;
                String string18;
                int i18;
                String string19;
                Cursor query = DBUtil.query(CollectionItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
                    int i19 = columnIndexOrThrow13;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        int i20 = query.getInt(columnIndexOrThrow);
                        String string20 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        String string21 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        long j = query.getLong(columnIndexOrThrow5);
                        if (query.isNull(columnIndexOrThrow6)) {
                            i = columnIndexOrThrow;
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow6);
                            i = columnIndexOrThrow;
                        }
                        List<String> stringToStringMutableList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string);
                        if (stringToStringMutableList != null) {
                            Date longToDate = CollectionItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                            String string22 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                            String string23 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            String string24 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                            if (query.isNull(columnIndexOrThrow12)) {
                                i2 = i19;
                                string2 = null;
                            } else {
                                string2 = query.getString(columnIndexOrThrow12);
                                i2 = i19;
                            }
                            if (query.isNull(i2)) {
                                i3 = columnIndexOrThrow14;
                                string3 = null;
                            } else {
                                string3 = query.getString(i2);
                                i3 = columnIndexOrThrow14;
                            }
                            if (query.isNull(i3)) {
                                i19 = i2;
                                i4 = columnIndexOrThrow15;
                                string4 = null;
                            } else {
                                i19 = i2;
                                string4 = query.getString(i3);
                                i4 = columnIndexOrThrow15;
                            }
                            if (query.isNull(i4)) {
                                columnIndexOrThrow15 = i4;
                                i5 = columnIndexOrThrow16;
                                string5 = null;
                            } else {
                                columnIndexOrThrow15 = i4;
                                string5 = query.getString(i4);
                                i5 = columnIndexOrThrow16;
                            }
                            if (query.isNull(i5)) {
                                columnIndexOrThrow16 = i5;
                                i6 = columnIndexOrThrow17;
                                string6 = null;
                            } else {
                                columnIndexOrThrow16 = i5;
                                string6 = query.getString(i5);
                                i6 = columnIndexOrThrow17;
                            }
                            if (query.isNull(i6)) {
                                columnIndexOrThrow17 = i6;
                                i7 = columnIndexOrThrow18;
                                string7 = null;
                            } else {
                                columnIndexOrThrow17 = i6;
                                string7 = query.getString(i6);
                                i7 = columnIndexOrThrow18;
                            }
                            if (query.isNull(i7)) {
                                columnIndexOrThrow18 = i7;
                                i8 = columnIndexOrThrow19;
                                string8 = null;
                            } else {
                                columnIndexOrThrow18 = i7;
                                string8 = query.getString(i7);
                                i8 = columnIndexOrThrow19;
                            }
                            if (query.isNull(i8)) {
                                columnIndexOrThrow19 = i8;
                                i9 = columnIndexOrThrow20;
                                string9 = null;
                            } else {
                                columnIndexOrThrow19 = i8;
                                string9 = query.getString(i8);
                                i9 = columnIndexOrThrow20;
                            }
                            if (query.isNull(i9)) {
                                columnIndexOrThrow20 = i9;
                                i10 = columnIndexOrThrow21;
                                string10 = null;
                            } else {
                                columnIndexOrThrow20 = i9;
                                string10 = query.getString(i9);
                                i10 = columnIndexOrThrow21;
                            }
                            if (query.isNull(i10)) {
                                columnIndexOrThrow21 = i10;
                                i11 = columnIndexOrThrow22;
                                string11 = null;
                            } else {
                                columnIndexOrThrow21 = i10;
                                string11 = query.getString(i10);
                                i11 = columnIndexOrThrow22;
                            }
                            if (query.isNull(i11)) {
                                columnIndexOrThrow22 = i11;
                                i12 = columnIndexOrThrow23;
                                valueOf = null;
                            } else {
                                columnIndexOrThrow22 = i11;
                                valueOf = Integer.valueOf(query.getInt(i11));
                                i12 = columnIndexOrThrow23;
                            }
                            if (query.isNull(i12)) {
                                columnIndexOrThrow23 = i12;
                                i13 = columnIndexOrThrow2;
                                string12 = null;
                            } else {
                                columnIndexOrThrow23 = i12;
                                string12 = query.getString(i12);
                                i13 = columnIndexOrThrow2;
                            }
                            PriceValue stringToPrice = CollectionItemDao_Impl.this.__dataBaseConverter.stringToPrice(string12);
                            int i21 = columnIndexOrThrow24;
                            if (query.isNull(i21)) {
                                i14 = columnIndexOrThrow25;
                                string13 = null;
                            } else {
                                string13 = query.getString(i21);
                                i14 = columnIndexOrThrow25;
                            }
                            if (query.isNull(i14)) {
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                                string14 = null;
                            } else {
                                string14 = query.getString(i14);
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                            }
                            if (query.isNull(i15)) {
                                columnIndexOrThrow26 = i15;
                                columnIndexOrThrow25 = i14;
                                string15 = null;
                            } else {
                                columnIndexOrThrow26 = i15;
                                string15 = query.getString(i15);
                                columnIndexOrThrow25 = i14;
                            }
                            List<String> stringToStringMutableList2 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string15);
                            int i22 = columnIndexOrThrow27;
                            if (query.isNull(i22)) {
                                columnIndexOrThrow27 = i22;
                                string16 = null;
                            } else {
                                string16 = query.getString(i22);
                                columnIndexOrThrow27 = i22;
                            }
                            List<String> stringToStringMutableList3 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string16);
                            int i23 = columnIndexOrThrow28;
                            if (query.isNull(i23)) {
                                i16 = columnIndexOrThrow29;
                                string17 = null;
                            } else {
                                string17 = query.getString(i23);
                                i16 = columnIndexOrThrow29;
                            }
                            if (query.isNull(i16)) {
                                i17 = i23;
                                i18 = i16;
                                string18 = null;
                            } else {
                                i17 = i23;
                                string18 = query.getString(i16);
                                i18 = i16;
                            }
                            List<CoinTag> stringToCoinTagList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string18);
                            int i24 = columnIndexOrThrow30;
                            if (query.isNull(i24)) {
                                columnIndexOrThrow30 = i24;
                                string19 = null;
                            } else {
                                string19 = query.getString(i24);
                                columnIndexOrThrow30 = i24;
                            }
                            arrayList.add(new CollectionItem(i20, string20, valueOf2, string21, j, stringToStringMutableList, longToDate, string22, valueOf3, string23, string24, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, valueOf, stringToPrice, string13, string14, stringToStringMutableList2, stringToStringMutableList3, string17, stringToCoinTagList, CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string19)));
                            columnIndexOrThrow2 = i13;
                            columnIndexOrThrow = i;
                            columnIndexOrThrow14 = i3;
                            int i25 = i17;
                            columnIndexOrThrow29 = i18;
                            columnIndexOrThrow28 = i25;
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                        }
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public CollectionItem getItemSync(final int collectionId) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        CollectionItem collectionItem;
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        String string4;
        int i4;
        String string5;
        int i5;
        String string6;
        int i6;
        String string7;
        int i7;
        String string8;
        int i8;
        String string9;
        int i9;
        Integer valueOf;
        int i10;
        String string10;
        int i11;
        String string11;
        int i12;
        String string12;
        int i13;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where collectionId=?", 1);
        acquire.bindLong(1, collectionId);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
            if (query.moveToFirst()) {
                int i14 = query.getInt(columnIndexOrThrow);
                String string13 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                String string14 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                long j = query.getLong(columnIndexOrThrow5);
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                String string15 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                String string16 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                String string17 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                String string18 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                if (query.isNull(columnIndexOrThrow13)) {
                    i = columnIndexOrThrow14;
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow13);
                    i = columnIndexOrThrow14;
                }
                if (query.isNull(i)) {
                    i2 = columnIndexOrThrow15;
                    string2 = null;
                } else {
                    string2 = query.getString(i);
                    i2 = columnIndexOrThrow15;
                }
                if (query.isNull(i2)) {
                    i3 = columnIndexOrThrow16;
                    string3 = null;
                } else {
                    string3 = query.getString(i2);
                    i3 = columnIndexOrThrow16;
                }
                if (query.isNull(i3)) {
                    i4 = columnIndexOrThrow17;
                    string4 = null;
                } else {
                    string4 = query.getString(i3);
                    i4 = columnIndexOrThrow17;
                }
                if (query.isNull(i4)) {
                    i5 = columnIndexOrThrow18;
                    string5 = null;
                } else {
                    string5 = query.getString(i4);
                    i5 = columnIndexOrThrow18;
                }
                if (query.isNull(i5)) {
                    i6 = columnIndexOrThrow19;
                    string6 = null;
                } else {
                    string6 = query.getString(i5);
                    i6 = columnIndexOrThrow19;
                }
                if (query.isNull(i6)) {
                    i7 = columnIndexOrThrow20;
                    string7 = null;
                } else {
                    string7 = query.getString(i6);
                    i7 = columnIndexOrThrow20;
                }
                if (query.isNull(i7)) {
                    i8 = columnIndexOrThrow21;
                    string8 = null;
                } else {
                    string8 = query.getString(i7);
                    i8 = columnIndexOrThrow21;
                }
                if (query.isNull(i8)) {
                    i9 = columnIndexOrThrow22;
                    string9 = null;
                } else {
                    string9 = query.getString(i8);
                    i9 = columnIndexOrThrow22;
                }
                if (query.isNull(i9)) {
                    i10 = columnIndexOrThrow23;
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(i9));
                    i10 = columnIndexOrThrow23;
                }
                PriceValue stringToPrice = this.__dataBaseConverter.stringToPrice(query.isNull(i10) ? null : query.getString(i10));
                if (query.isNull(columnIndexOrThrow24)) {
                    i11 = columnIndexOrThrow25;
                    string10 = null;
                } else {
                    string10 = query.getString(columnIndexOrThrow24);
                    i11 = columnIndexOrThrow25;
                }
                if (query.isNull(i11)) {
                    i12 = columnIndexOrThrow26;
                    string11 = null;
                } else {
                    string11 = query.getString(i11);
                    i12 = columnIndexOrThrow26;
                }
                List<String> stringToStringMutableList2 = this.__dataBaseConverter.stringToStringMutableList(query.isNull(i12) ? null : query.getString(i12));
                List<String> stringToStringMutableList3 = this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow27) ? null : query.getString(columnIndexOrThrow27));
                if (query.isNull(columnIndexOrThrow28)) {
                    i13 = columnIndexOrThrow29;
                    string12 = null;
                } else {
                    string12 = query.getString(columnIndexOrThrow28);
                    i13 = columnIndexOrThrow29;
                }
                collectionItem = new CollectionItem(i14, string13, valueOf2, string14, j, stringToStringMutableList, longToDate, string15, valueOf3, string16, string17, string18, string, string2, string3, string4, string5, string6, string7, string8, string9, valueOf, stringToPrice, string10, string11, stringToStringMutableList2, stringToStringMutableList3, string12, this.__dataBaseConverter.stringToCoinTagList(query.isNull(i13) ? null : query.getString(i13)), this.__dataBaseConverter.stringToCoinTagList(query.isNull(columnIndexOrThrow30) ? null : query.getString(columnIndexOrThrow30)));
            } else {
                collectionItem = null;
            }
            query.close();
            roomSQLiteQuery.release();
            return collectionItem;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public int getCountSync(final long userId) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select COUNT(collectionId) from CollectionItem where userId=?", 1);
        acquire.bindLong(1, userId);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            return query.moveToFirst() ? query.getInt(0) : 0;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public LiveData<List<CollectionItem>> queryByCustomSeriesId(final long userId, final int customSeriesId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=? and customSeriesId=? order by collectionId desc", 2);
        acquire.bindLong(1, userId);
        acquire.bindLong(2, customSeriesId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"CollectionItem"}, false, new Callable<List<CollectionItem>>() { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.10
            @Override // java.util.concurrent.Callable
            public List<CollectionItem> call() throws Exception {
                String string;
                int i;
                String string2;
                int i2;
                String string3;
                int i3;
                String string4;
                int i4;
                String string5;
                int i5;
                String string6;
                int i6;
                String string7;
                int i7;
                String string8;
                int i8;
                String string9;
                int i9;
                String string10;
                int i10;
                String string11;
                int i11;
                Integer valueOf;
                int i12;
                String string12;
                int i13;
                String string13;
                int i14;
                String string14;
                int i15;
                String string15;
                String string16;
                String string17;
                int i16;
                int i17;
                String string18;
                int i18;
                String string19;
                Cursor query = DBUtil.query(CollectionItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
                    int i19 = columnIndexOrThrow13;
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        int i20 = query.getInt(columnIndexOrThrow);
                        String string20 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        String string21 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        long j = query.getLong(columnIndexOrThrow5);
                        if (query.isNull(columnIndexOrThrow6)) {
                            i = columnIndexOrThrow;
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow6);
                            i = columnIndexOrThrow;
                        }
                        List<String> stringToStringMutableList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string);
                        if (stringToStringMutableList != null) {
                            Date longToDate = CollectionItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                            String string22 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                            String string23 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            String string24 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                            if (query.isNull(columnIndexOrThrow12)) {
                                i2 = i19;
                                string2 = null;
                            } else {
                                string2 = query.getString(columnIndexOrThrow12);
                                i2 = i19;
                            }
                            if (query.isNull(i2)) {
                                i3 = columnIndexOrThrow14;
                                string3 = null;
                            } else {
                                string3 = query.getString(i2);
                                i3 = columnIndexOrThrow14;
                            }
                            if (query.isNull(i3)) {
                                i19 = i2;
                                i4 = columnIndexOrThrow15;
                                string4 = null;
                            } else {
                                i19 = i2;
                                string4 = query.getString(i3);
                                i4 = columnIndexOrThrow15;
                            }
                            if (query.isNull(i4)) {
                                columnIndexOrThrow15 = i4;
                                i5 = columnIndexOrThrow16;
                                string5 = null;
                            } else {
                                columnIndexOrThrow15 = i4;
                                string5 = query.getString(i4);
                                i5 = columnIndexOrThrow16;
                            }
                            if (query.isNull(i5)) {
                                columnIndexOrThrow16 = i5;
                                i6 = columnIndexOrThrow17;
                                string6 = null;
                            } else {
                                columnIndexOrThrow16 = i5;
                                string6 = query.getString(i5);
                                i6 = columnIndexOrThrow17;
                            }
                            if (query.isNull(i6)) {
                                columnIndexOrThrow17 = i6;
                                i7 = columnIndexOrThrow18;
                                string7 = null;
                            } else {
                                columnIndexOrThrow17 = i6;
                                string7 = query.getString(i6);
                                i7 = columnIndexOrThrow18;
                            }
                            if (query.isNull(i7)) {
                                columnIndexOrThrow18 = i7;
                                i8 = columnIndexOrThrow19;
                                string8 = null;
                            } else {
                                columnIndexOrThrow18 = i7;
                                string8 = query.getString(i7);
                                i8 = columnIndexOrThrow19;
                            }
                            if (query.isNull(i8)) {
                                columnIndexOrThrow19 = i8;
                                i9 = columnIndexOrThrow20;
                                string9 = null;
                            } else {
                                columnIndexOrThrow19 = i8;
                                string9 = query.getString(i8);
                                i9 = columnIndexOrThrow20;
                            }
                            if (query.isNull(i9)) {
                                columnIndexOrThrow20 = i9;
                                i10 = columnIndexOrThrow21;
                                string10 = null;
                            } else {
                                columnIndexOrThrow20 = i9;
                                string10 = query.getString(i9);
                                i10 = columnIndexOrThrow21;
                            }
                            if (query.isNull(i10)) {
                                columnIndexOrThrow21 = i10;
                                i11 = columnIndexOrThrow22;
                                string11 = null;
                            } else {
                                columnIndexOrThrow21 = i10;
                                string11 = query.getString(i10);
                                i11 = columnIndexOrThrow22;
                            }
                            if (query.isNull(i11)) {
                                columnIndexOrThrow22 = i11;
                                i12 = columnIndexOrThrow23;
                                valueOf = null;
                            } else {
                                columnIndexOrThrow22 = i11;
                                valueOf = Integer.valueOf(query.getInt(i11));
                                i12 = columnIndexOrThrow23;
                            }
                            if (query.isNull(i12)) {
                                columnIndexOrThrow23 = i12;
                                i13 = columnIndexOrThrow2;
                                string12 = null;
                            } else {
                                columnIndexOrThrow23 = i12;
                                string12 = query.getString(i12);
                                i13 = columnIndexOrThrow2;
                            }
                            PriceValue stringToPrice = CollectionItemDao_Impl.this.__dataBaseConverter.stringToPrice(string12);
                            int i21 = columnIndexOrThrow24;
                            if (query.isNull(i21)) {
                                i14 = columnIndexOrThrow25;
                                string13 = null;
                            } else {
                                string13 = query.getString(i21);
                                i14 = columnIndexOrThrow25;
                            }
                            if (query.isNull(i14)) {
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                                string14 = null;
                            } else {
                                string14 = query.getString(i14);
                                columnIndexOrThrow24 = i21;
                                i15 = columnIndexOrThrow26;
                            }
                            if (query.isNull(i15)) {
                                columnIndexOrThrow26 = i15;
                                columnIndexOrThrow25 = i14;
                                string15 = null;
                            } else {
                                columnIndexOrThrow26 = i15;
                                string15 = query.getString(i15);
                                columnIndexOrThrow25 = i14;
                            }
                            List<String> stringToStringMutableList2 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string15);
                            int i22 = columnIndexOrThrow27;
                            if (query.isNull(i22)) {
                                columnIndexOrThrow27 = i22;
                                string16 = null;
                            } else {
                                string16 = query.getString(i22);
                                columnIndexOrThrow27 = i22;
                            }
                            List<String> stringToStringMutableList3 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(string16);
                            int i23 = columnIndexOrThrow28;
                            if (query.isNull(i23)) {
                                i16 = columnIndexOrThrow29;
                                string17 = null;
                            } else {
                                string17 = query.getString(i23);
                                i16 = columnIndexOrThrow29;
                            }
                            if (query.isNull(i16)) {
                                i17 = i23;
                                i18 = i16;
                                string18 = null;
                            } else {
                                i17 = i23;
                                string18 = query.getString(i16);
                                i18 = i16;
                            }
                            List<CoinTag> stringToCoinTagList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string18);
                            int i24 = columnIndexOrThrow30;
                            if (query.isNull(i24)) {
                                columnIndexOrThrow30 = i24;
                                string19 = null;
                            } else {
                                string19 = query.getString(i24);
                                columnIndexOrThrow30 = i24;
                            }
                            arrayList.add(new CollectionItem(i20, string20, valueOf2, string21, j, stringToStringMutableList, longToDate, string22, valueOf3, string23, string24, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, valueOf, stringToPrice, string13, string14, stringToStringMutableList2, stringToStringMutableList3, string17, stringToCoinTagList, CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(string19)));
                            columnIndexOrThrow2 = i13;
                            columnIndexOrThrow = i;
                            columnIndexOrThrow14 = i3;
                            int i25 = i17;
                            columnIndexOrThrow29 = i18;
                            columnIndexOrThrow28 = i25;
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                        }
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public List<CollectionItem> queryByCustomSeriesIdSync(final long userId, final int customSeriesId) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        String string4;
        int i4;
        String str;
        String string5;
        int i5;
        String string6;
        int i6;
        String string7;
        int i7;
        String string8;
        int i8;
        String string9;
        int i9;
        String string10;
        int i10;
        Integer valueOf;
        int i11;
        int i12;
        String string11;
        int i13;
        String string12;
        int i14;
        String string13;
        int i15;
        String string14;
        String string15;
        String string16;
        int i16;
        int i17;
        String string17;
        int i18;
        String string18;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=? and customSeriesId=? order by collectionId desc", 2);
        acquire.bindLong(1, userId);
        acquire.bindLong(2, customSeriesId);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
            int i19 = columnIndexOrThrow13;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i20 = query.getInt(columnIndexOrThrow);
                String string19 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                String string20 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                long j = query.getLong(columnIndexOrThrow5);
                if (query.isNull(columnIndexOrThrow6)) {
                    i = columnIndexOrThrow;
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow6);
                    i = columnIndexOrThrow;
                }
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(string);
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                String string21 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                String string22 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                String string23 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                if (query.isNull(columnIndexOrThrow12)) {
                    i2 = i19;
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow12);
                    i2 = i19;
                }
                if (query.isNull(i2)) {
                    i3 = columnIndexOrThrow14;
                    string3 = null;
                } else {
                    string3 = query.getString(i2);
                    i3 = columnIndexOrThrow14;
                }
                if (query.isNull(i3)) {
                    i19 = i2;
                    string4 = null;
                } else {
                    string4 = query.getString(i3);
                    i19 = i2;
                }
                int i21 = columnIndexOrThrow15;
                if (query.isNull(i21)) {
                    columnIndexOrThrow15 = i21;
                    i4 = columnIndexOrThrow16;
                    str = null;
                } else {
                    String string24 = query.getString(i21);
                    columnIndexOrThrow15 = i21;
                    i4 = columnIndexOrThrow16;
                    str = string24;
                }
                if (query.isNull(i4)) {
                    columnIndexOrThrow16 = i4;
                    i5 = columnIndexOrThrow17;
                    string5 = null;
                } else {
                    string5 = query.getString(i4);
                    columnIndexOrThrow16 = i4;
                    i5 = columnIndexOrThrow17;
                }
                if (query.isNull(i5)) {
                    columnIndexOrThrow17 = i5;
                    i6 = columnIndexOrThrow18;
                    string6 = null;
                } else {
                    string6 = query.getString(i5);
                    columnIndexOrThrow17 = i5;
                    i6 = columnIndexOrThrow18;
                }
                if (query.isNull(i6)) {
                    columnIndexOrThrow18 = i6;
                    i7 = columnIndexOrThrow19;
                    string7 = null;
                } else {
                    string7 = query.getString(i6);
                    columnIndexOrThrow18 = i6;
                    i7 = columnIndexOrThrow19;
                }
                if (query.isNull(i7)) {
                    columnIndexOrThrow19 = i7;
                    i8 = columnIndexOrThrow20;
                    string8 = null;
                } else {
                    string8 = query.getString(i7);
                    columnIndexOrThrow19 = i7;
                    i8 = columnIndexOrThrow20;
                }
                if (query.isNull(i8)) {
                    columnIndexOrThrow20 = i8;
                    i9 = columnIndexOrThrow21;
                    string9 = null;
                } else {
                    string9 = query.getString(i8);
                    columnIndexOrThrow20 = i8;
                    i9 = columnIndexOrThrow21;
                }
                if (query.isNull(i9)) {
                    columnIndexOrThrow21 = i9;
                    i10 = columnIndexOrThrow22;
                    string10 = null;
                } else {
                    string10 = query.getString(i9);
                    columnIndexOrThrow21 = i9;
                    i10 = columnIndexOrThrow22;
                }
                if (query.isNull(i10)) {
                    columnIndexOrThrow22 = i10;
                    i11 = columnIndexOrThrow23;
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(i10));
                    columnIndexOrThrow22 = i10;
                    i11 = columnIndexOrThrow23;
                }
                if (query.isNull(i11)) {
                    i12 = i11;
                    i13 = i3;
                    string11 = null;
                } else {
                    i12 = i11;
                    string11 = query.getString(i11);
                    i13 = i3;
                }
                PriceValue stringToPrice = this.__dataBaseConverter.stringToPrice(string11);
                int i22 = columnIndexOrThrow24;
                if (query.isNull(i22)) {
                    i14 = columnIndexOrThrow25;
                    string12 = null;
                } else {
                    string12 = query.getString(i22);
                    i14 = columnIndexOrThrow25;
                }
                if (query.isNull(i14)) {
                    columnIndexOrThrow24 = i22;
                    i15 = columnIndexOrThrow26;
                    string13 = null;
                } else {
                    string13 = query.getString(i14);
                    columnIndexOrThrow24 = i22;
                    i15 = columnIndexOrThrow26;
                }
                if (query.isNull(i15)) {
                    columnIndexOrThrow26 = i15;
                    columnIndexOrThrow25 = i14;
                    string14 = null;
                } else {
                    columnIndexOrThrow26 = i15;
                    string14 = query.getString(i15);
                    columnIndexOrThrow25 = i14;
                }
                List<String> stringToStringMutableList2 = this.__dataBaseConverter.stringToStringMutableList(string14);
                int i23 = columnIndexOrThrow27;
                if (query.isNull(i23)) {
                    columnIndexOrThrow27 = i23;
                    string15 = null;
                } else {
                    string15 = query.getString(i23);
                    columnIndexOrThrow27 = i23;
                }
                List<String> stringToStringMutableList3 = this.__dataBaseConverter.stringToStringMutableList(string15);
                int i24 = columnIndexOrThrow28;
                if (query.isNull(i24)) {
                    i16 = columnIndexOrThrow29;
                    string16 = null;
                } else {
                    string16 = query.getString(i24);
                    i16 = columnIndexOrThrow29;
                }
                if (query.isNull(i16)) {
                    i17 = i24;
                    i18 = i16;
                    string17 = null;
                } else {
                    i17 = i24;
                    string17 = query.getString(i16);
                    i18 = i16;
                }
                List<CoinTag> stringToCoinTagList = this.__dataBaseConverter.stringToCoinTagList(string17);
                int i25 = columnIndexOrThrow30;
                if (query.isNull(i25)) {
                    columnIndexOrThrow30 = i25;
                    string18 = null;
                } else {
                    string18 = query.getString(i25);
                    columnIndexOrThrow30 = i25;
                }
                arrayList.add(new CollectionItem(i20, string19, valueOf2, string20, j, stringToStringMutableList, longToDate, string21, valueOf3, string22, string23, string2, string3, string4, str, string5, string6, string7, string8, string9, string10, valueOf, stringToPrice, string12, string13, stringToStringMutableList2, stringToStringMutableList3, string16, stringToCoinTagList, this.__dataBaseConverter.stringToCoinTagList(string18)));
                columnIndexOrThrow = i;
                int i26 = i13;
                columnIndexOrThrow23 = i12;
                columnIndexOrThrow14 = i26;
                int i27 = i17;
                columnIndexOrThrow29 = i18;
                columnIndexOrThrow28 = i27;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public List<CollectionItem> queryByCountryCode(final long userId, final String countryCode) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        String string4;
        int i4;
        String str;
        String string5;
        int i5;
        String string6;
        int i6;
        String string7;
        int i7;
        String string8;
        int i8;
        String string9;
        int i9;
        String string10;
        int i10;
        Integer valueOf;
        int i11;
        int i12;
        String string11;
        int i13;
        String string12;
        int i14;
        String string13;
        int i15;
        String string14;
        String string15;
        String string16;
        int i16;
        int i17;
        String string17;
        int i18;
        String string18;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=? and issuerCountryCode=? order by collectionId desc", 2);
        acquire.bindLong(1, userId);
        if (countryCode == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, countryCode);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
            int i19 = columnIndexOrThrow13;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i20 = query.getInt(columnIndexOrThrow);
                String string19 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                String string20 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                long j = query.getLong(columnIndexOrThrow5);
                if (query.isNull(columnIndexOrThrow6)) {
                    i = columnIndexOrThrow;
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow6);
                    i = columnIndexOrThrow;
                }
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(string);
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                String string21 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                String string22 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                String string23 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                if (query.isNull(columnIndexOrThrow12)) {
                    i2 = i19;
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow12);
                    i2 = i19;
                }
                if (query.isNull(i2)) {
                    i3 = columnIndexOrThrow14;
                    string3 = null;
                } else {
                    string3 = query.getString(i2);
                    i3 = columnIndexOrThrow14;
                }
                if (query.isNull(i3)) {
                    i19 = i2;
                    string4 = null;
                } else {
                    string4 = query.getString(i3);
                    i19 = i2;
                }
                int i21 = columnIndexOrThrow15;
                if (query.isNull(i21)) {
                    columnIndexOrThrow15 = i21;
                    i4 = columnIndexOrThrow16;
                    str = null;
                } else {
                    String string24 = query.getString(i21);
                    columnIndexOrThrow15 = i21;
                    i4 = columnIndexOrThrow16;
                    str = string24;
                }
                if (query.isNull(i4)) {
                    columnIndexOrThrow16 = i4;
                    i5 = columnIndexOrThrow17;
                    string5 = null;
                } else {
                    string5 = query.getString(i4);
                    columnIndexOrThrow16 = i4;
                    i5 = columnIndexOrThrow17;
                }
                if (query.isNull(i5)) {
                    columnIndexOrThrow17 = i5;
                    i6 = columnIndexOrThrow18;
                    string6 = null;
                } else {
                    string6 = query.getString(i5);
                    columnIndexOrThrow17 = i5;
                    i6 = columnIndexOrThrow18;
                }
                if (query.isNull(i6)) {
                    columnIndexOrThrow18 = i6;
                    i7 = columnIndexOrThrow19;
                    string7 = null;
                } else {
                    string7 = query.getString(i6);
                    columnIndexOrThrow18 = i6;
                    i7 = columnIndexOrThrow19;
                }
                if (query.isNull(i7)) {
                    columnIndexOrThrow19 = i7;
                    i8 = columnIndexOrThrow20;
                    string8 = null;
                } else {
                    string8 = query.getString(i7);
                    columnIndexOrThrow19 = i7;
                    i8 = columnIndexOrThrow20;
                }
                if (query.isNull(i8)) {
                    columnIndexOrThrow20 = i8;
                    i9 = columnIndexOrThrow21;
                    string9 = null;
                } else {
                    string9 = query.getString(i8);
                    columnIndexOrThrow20 = i8;
                    i9 = columnIndexOrThrow21;
                }
                if (query.isNull(i9)) {
                    columnIndexOrThrow21 = i9;
                    i10 = columnIndexOrThrow22;
                    string10 = null;
                } else {
                    string10 = query.getString(i9);
                    columnIndexOrThrow21 = i9;
                    i10 = columnIndexOrThrow22;
                }
                if (query.isNull(i10)) {
                    columnIndexOrThrow22 = i10;
                    i11 = columnIndexOrThrow23;
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(i10));
                    columnIndexOrThrow22 = i10;
                    i11 = columnIndexOrThrow23;
                }
                if (query.isNull(i11)) {
                    i12 = i11;
                    i13 = i3;
                    string11 = null;
                } else {
                    i12 = i11;
                    string11 = query.getString(i11);
                    i13 = i3;
                }
                PriceValue stringToPrice = this.__dataBaseConverter.stringToPrice(string11);
                int i22 = columnIndexOrThrow24;
                if (query.isNull(i22)) {
                    i14 = columnIndexOrThrow25;
                    string12 = null;
                } else {
                    string12 = query.getString(i22);
                    i14 = columnIndexOrThrow25;
                }
                if (query.isNull(i14)) {
                    columnIndexOrThrow24 = i22;
                    i15 = columnIndexOrThrow26;
                    string13 = null;
                } else {
                    string13 = query.getString(i14);
                    columnIndexOrThrow24 = i22;
                    i15 = columnIndexOrThrow26;
                }
                if (query.isNull(i15)) {
                    columnIndexOrThrow26 = i15;
                    columnIndexOrThrow25 = i14;
                    string14 = null;
                } else {
                    columnIndexOrThrow26 = i15;
                    string14 = query.getString(i15);
                    columnIndexOrThrow25 = i14;
                }
                List<String> stringToStringMutableList2 = this.__dataBaseConverter.stringToStringMutableList(string14);
                int i23 = columnIndexOrThrow27;
                if (query.isNull(i23)) {
                    columnIndexOrThrow27 = i23;
                    string15 = null;
                } else {
                    string15 = query.getString(i23);
                    columnIndexOrThrow27 = i23;
                }
                List<String> stringToStringMutableList3 = this.__dataBaseConverter.stringToStringMutableList(string15);
                int i24 = columnIndexOrThrow28;
                if (query.isNull(i24)) {
                    i16 = columnIndexOrThrow29;
                    string16 = null;
                } else {
                    string16 = query.getString(i24);
                    i16 = columnIndexOrThrow29;
                }
                if (query.isNull(i16)) {
                    i17 = i24;
                    i18 = i16;
                    string17 = null;
                } else {
                    i17 = i24;
                    string17 = query.getString(i16);
                    i18 = i16;
                }
                List<CoinTag> stringToCoinTagList = this.__dataBaseConverter.stringToCoinTagList(string17);
                int i25 = columnIndexOrThrow30;
                if (query.isNull(i25)) {
                    columnIndexOrThrow30 = i25;
                    string18 = null;
                } else {
                    string18 = query.getString(i25);
                    columnIndexOrThrow30 = i25;
                }
                arrayList.add(new CollectionItem(i20, string19, valueOf2, string20, j, stringToStringMutableList, longToDate, string21, valueOf3, string22, string23, string2, string3, string4, str, string5, string6, string7, string8, string9, string10, valueOf, stringToPrice, string12, string13, stringToStringMutableList2, stringToStringMutableList3, string16, stringToCoinTagList, this.__dataBaseConverter.stringToCoinTagList(string18)));
                columnIndexOrThrow = i;
                int i26 = i13;
                columnIndexOrThrow23 = i12;
                columnIndexOrThrow14 = i26;
                int i27 = i17;
                columnIndexOrThrow29 = i18;
                columnIndexOrThrow28 = i27;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public CollectionItem queryByItemIdSync(final long userId, final long itemId) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        CollectionItem collectionItem;
        String string;
        int i;
        String string2;
        int i2;
        String string3;
        int i3;
        String string4;
        int i4;
        String string5;
        int i5;
        String string6;
        int i6;
        String string7;
        int i7;
        String string8;
        int i8;
        String string9;
        int i9;
        Integer valueOf;
        int i10;
        String string10;
        int i11;
        String string11;
        int i12;
        String string12;
        int i13;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=? and itemId=?", 2);
        acquire.bindLong(1, userId);
        acquire.bindLong(2, itemId);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
            int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
            int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
            int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
            int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
            int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
            int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
            int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
            if (query.moveToFirst()) {
                int i14 = query.getInt(columnIndexOrThrow);
                String string13 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                String string14 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                long j = query.getLong(columnIndexOrThrow5);
                List<String> stringToStringMutableList = this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                if (stringToStringMutableList == null) {
                    throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                }
                Date longToDate = this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                String string15 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                String string16 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                String string17 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                String string18 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                if (query.isNull(columnIndexOrThrow13)) {
                    i = columnIndexOrThrow14;
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow13);
                    i = columnIndexOrThrow14;
                }
                if (query.isNull(i)) {
                    i2 = columnIndexOrThrow15;
                    string2 = null;
                } else {
                    string2 = query.getString(i);
                    i2 = columnIndexOrThrow15;
                }
                if (query.isNull(i2)) {
                    i3 = columnIndexOrThrow16;
                    string3 = null;
                } else {
                    string3 = query.getString(i2);
                    i3 = columnIndexOrThrow16;
                }
                if (query.isNull(i3)) {
                    i4 = columnIndexOrThrow17;
                    string4 = null;
                } else {
                    string4 = query.getString(i3);
                    i4 = columnIndexOrThrow17;
                }
                if (query.isNull(i4)) {
                    i5 = columnIndexOrThrow18;
                    string5 = null;
                } else {
                    string5 = query.getString(i4);
                    i5 = columnIndexOrThrow18;
                }
                if (query.isNull(i5)) {
                    i6 = columnIndexOrThrow19;
                    string6 = null;
                } else {
                    string6 = query.getString(i5);
                    i6 = columnIndexOrThrow19;
                }
                if (query.isNull(i6)) {
                    i7 = columnIndexOrThrow20;
                    string7 = null;
                } else {
                    string7 = query.getString(i6);
                    i7 = columnIndexOrThrow20;
                }
                if (query.isNull(i7)) {
                    i8 = columnIndexOrThrow21;
                    string8 = null;
                } else {
                    string8 = query.getString(i7);
                    i8 = columnIndexOrThrow21;
                }
                if (query.isNull(i8)) {
                    i9 = columnIndexOrThrow22;
                    string9 = null;
                } else {
                    string9 = query.getString(i8);
                    i9 = columnIndexOrThrow22;
                }
                if (query.isNull(i9)) {
                    i10 = columnIndexOrThrow23;
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(i9));
                    i10 = columnIndexOrThrow23;
                }
                PriceValue stringToPrice = this.__dataBaseConverter.stringToPrice(query.isNull(i10) ? null : query.getString(i10));
                if (query.isNull(columnIndexOrThrow24)) {
                    i11 = columnIndexOrThrow25;
                    string10 = null;
                } else {
                    string10 = query.getString(columnIndexOrThrow24);
                    i11 = columnIndexOrThrow25;
                }
                if (query.isNull(i11)) {
                    i12 = columnIndexOrThrow26;
                    string11 = null;
                } else {
                    string11 = query.getString(i11);
                    i12 = columnIndexOrThrow26;
                }
                List<String> stringToStringMutableList2 = this.__dataBaseConverter.stringToStringMutableList(query.isNull(i12) ? null : query.getString(i12));
                List<String> stringToStringMutableList3 = this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow27) ? null : query.getString(columnIndexOrThrow27));
                if (query.isNull(columnIndexOrThrow28)) {
                    i13 = columnIndexOrThrow29;
                    string12 = null;
                } else {
                    string12 = query.getString(columnIndexOrThrow28);
                    i13 = columnIndexOrThrow29;
                }
                collectionItem = new CollectionItem(i14, string13, valueOf2, string14, j, stringToStringMutableList, longToDate, string15, valueOf3, string16, string17, string18, string, string2, string3, string4, string5, string6, string7, string8, string9, valueOf, stringToPrice, string10, string11, stringToStringMutableList2, stringToStringMutableList3, string12, this.__dataBaseConverter.stringToCoinTagList(query.isNull(i13) ? null : query.getString(i13)), this.__dataBaseConverter.stringToCoinTagList(query.isNull(columnIndexOrThrow30) ? null : query.getString(columnIndexOrThrow30)));
            } else {
                collectionItem = null;
            }
            query.close();
            roomSQLiteQuery.release();
            return collectionItem;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // com.glority.android.database.dao.CollectionItemDao
    public LiveData<CollectionItem> queryByItemId(final long userId, final long itemId) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from CollectionItem where userId=? and itemId=?", 2);
        acquire.bindLong(1, userId);
        acquire.bindLong(2, itemId);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"CollectionItem"}, false, new Callable<CollectionItem>() { // from class: com.glority.android.database.dao.CollectionItemDao_Impl.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public CollectionItem call() throws Exception {
                CollectionItem collectionItem;
                String string;
                int i;
                String string2;
                int i2;
                String string3;
                int i3;
                String string4;
                int i4;
                String string5;
                int i5;
                String string6;
                int i6;
                String string7;
                int i7;
                String string8;
                int i8;
                String string9;
                int i9;
                Integer valueOf;
                int i10;
                String string10;
                int i11;
                String string11;
                int i12;
                String string12;
                int i13;
                Cursor query = DBUtil.query(CollectionItemDao_Impl.this.__db, acquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "collectionId");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, Args.uid);
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "itemId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "name");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "userId");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "imageUrl");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "date");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, LogEventArguments.ARG_NUMBER);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "acquisitionPrice");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "note");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "grade");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "priceUnit");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, Args.year);
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "mintMark");
                    int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, Args.denominationSideUrl);
                    int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, Args.subjectSideUrl);
                    int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "seriesIndexListUid");
                    int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, Args.speciesUid);
                    int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, Args.varietyUid);
                    int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "issuerCountryCode");
                    int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "issuer");
                    int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, Args.customSeriesId);
                    int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "marketValue");
                    int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "mintage");
                    int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "denomination");
                    int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "compositionTypes");
                    int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "compositionOptions");
                    int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "mintMarkV2");
                    int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "subThemes");
                    int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "seriesList");
                    if (query.moveToFirst()) {
                        int i14 = query.getInt(columnIndexOrThrow);
                        String string13 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        Long valueOf2 = query.isNull(columnIndexOrThrow3) ? null : Long.valueOf(query.getLong(columnIndexOrThrow3));
                        String string14 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        long j = query.getLong(columnIndexOrThrow5);
                        List<String> stringToStringMutableList = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6));
                        if (stringToStringMutableList != null) {
                            Date longToDate = CollectionItemDao_Impl.this.__dataBaseConverter.longToDate(query.isNull(columnIndexOrThrow7) ? null : Long.valueOf(query.getLong(columnIndexOrThrow7)));
                            String string15 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            Double valueOf3 = query.isNull(columnIndexOrThrow9) ? null : Double.valueOf(query.getDouble(columnIndexOrThrow9));
                            String string16 = query.isNull(columnIndexOrThrow10) ? null : query.getString(columnIndexOrThrow10);
                            String string17 = query.isNull(columnIndexOrThrow11) ? null : query.getString(columnIndexOrThrow11);
                            String string18 = query.isNull(columnIndexOrThrow12) ? null : query.getString(columnIndexOrThrow12);
                            if (query.isNull(columnIndexOrThrow13)) {
                                i = columnIndexOrThrow14;
                                string = null;
                            } else {
                                string = query.getString(columnIndexOrThrow13);
                                i = columnIndexOrThrow14;
                            }
                            if (query.isNull(i)) {
                                i2 = columnIndexOrThrow15;
                                string2 = null;
                            } else {
                                string2 = query.getString(i);
                                i2 = columnIndexOrThrow15;
                            }
                            if (query.isNull(i2)) {
                                i3 = columnIndexOrThrow16;
                                string3 = null;
                            } else {
                                string3 = query.getString(i2);
                                i3 = columnIndexOrThrow16;
                            }
                            if (query.isNull(i3)) {
                                i4 = columnIndexOrThrow17;
                                string4 = null;
                            } else {
                                string4 = query.getString(i3);
                                i4 = columnIndexOrThrow17;
                            }
                            if (query.isNull(i4)) {
                                i5 = columnIndexOrThrow18;
                                string5 = null;
                            } else {
                                string5 = query.getString(i4);
                                i5 = columnIndexOrThrow18;
                            }
                            if (query.isNull(i5)) {
                                i6 = columnIndexOrThrow19;
                                string6 = null;
                            } else {
                                string6 = query.getString(i5);
                                i6 = columnIndexOrThrow19;
                            }
                            if (query.isNull(i6)) {
                                i7 = columnIndexOrThrow20;
                                string7 = null;
                            } else {
                                string7 = query.getString(i6);
                                i7 = columnIndexOrThrow20;
                            }
                            if (query.isNull(i7)) {
                                i8 = columnIndexOrThrow21;
                                string8 = null;
                            } else {
                                string8 = query.getString(i7);
                                i8 = columnIndexOrThrow21;
                            }
                            if (query.isNull(i8)) {
                                i9 = columnIndexOrThrow22;
                                string9 = null;
                            } else {
                                string9 = query.getString(i8);
                                i9 = columnIndexOrThrow22;
                            }
                            if (query.isNull(i9)) {
                                i10 = columnIndexOrThrow23;
                                valueOf = null;
                            } else {
                                valueOf = Integer.valueOf(query.getInt(i9));
                                i10 = columnIndexOrThrow23;
                            }
                            PriceValue stringToPrice = CollectionItemDao_Impl.this.__dataBaseConverter.stringToPrice(query.isNull(i10) ? null : query.getString(i10));
                            if (query.isNull(columnIndexOrThrow24)) {
                                i11 = columnIndexOrThrow25;
                                string10 = null;
                            } else {
                                string10 = query.getString(columnIndexOrThrow24);
                                i11 = columnIndexOrThrow25;
                            }
                            if (query.isNull(i11)) {
                                i12 = columnIndexOrThrow26;
                                string11 = null;
                            } else {
                                string11 = query.getString(i11);
                                i12 = columnIndexOrThrow26;
                            }
                            List<String> stringToStringMutableList2 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(i12) ? null : query.getString(i12));
                            List<String> stringToStringMutableList3 = CollectionItemDao_Impl.this.__dataBaseConverter.stringToStringMutableList(query.isNull(columnIndexOrThrow27) ? null : query.getString(columnIndexOrThrow27));
                            if (query.isNull(columnIndexOrThrow28)) {
                                i13 = columnIndexOrThrow29;
                                string12 = null;
                            } else {
                                string12 = query.getString(columnIndexOrThrow28);
                                i13 = columnIndexOrThrow29;
                            }
                            collectionItem = new CollectionItem(i14, string13, valueOf2, string14, j, stringToStringMutableList, longToDate, string15, valueOf3, string16, string17, string18, string, string2, string3, string4, string5, string6, string7, string8, string9, valueOf, stringToPrice, string10, string11, stringToStringMutableList2, stringToStringMutableList3, string12, CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(query.isNull(i13) ? null : query.getString(i13)), CollectionItemDao_Impl.this.__dataBaseConverter.stringToCoinTagList(query.isNull(columnIndexOrThrow30) ? null : query.getString(columnIndexOrThrow30)));
                        } else {
                            throw new IllegalStateException("Expected non-null java.util.List<java.lang.String>, but it was null.");
                        }
                    } else {
                        collectionItem = null;
                    }
                    return collectionItem;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}
