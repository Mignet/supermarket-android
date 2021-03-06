//package com.v5ent.xiubit.util;
//
///**
// * 新手指导任务 常量
// */
//public class GuideTaskConstent {
//
//    /**
//     * 任务类型 第一个任务取0位置。。。
//     */
//    public static int[] TASK_TYPE = {1, 2};
//    /**
//     * 不同任务的最大步数 不包含奖励那一步， 第一个任务取0位置。。。
//     */
//    public static int[] MAX_STEP = {7, 7, 5, 7, 5, 3};
//
//    /**
//     * 退出按钮在左边为1，右边为2
//     */
//    public static int[][] BACK_LEFT_OR_RIGHT = {{1, 1, 2, 2, 1, 1, 3}, //邀请客户
//            {2, 2, 1, 1, 2, 1, 3}, //推荐产品给客户
//            {2, 2, 2, 2, 2, 3}, //红包
//            {1, 1, 2, 2, 1, 1, 3},//推荐理财师
//            {2, 2, 2, 2, 3}, //自己购买
//            {2, 2, 3},};
//
//    /**
//     * 可点击的区域范围 第一个任务取0位置。。。
//     * 以基准尺寸 1920*1080的标准
//     * 指定的能触摸范围  int left, int top, int width, int height
//     * {0, 0, 1080, 1920}
//     * 三层数组， 表示第几个任务，第几步，区域范围
//     */
//    public static int[][][] touchRectss = {{{966, 60, 120, 120}, {730, 214, 360, 135}, {0, 1240, 1080, 220}, {0, 1600, 300, 220}, {890, 60, 190, 120}, {785, 45, 171, 130}, {0, 60, 110, 110}},//邀请客户
//            {{879, 800, 210, 210}, {0, 600, 1080, 140}, {0, 1770, 1080, 250}, {594, 1095, 300, 120}, {435, 1475, 240, 130}, {759, 50, 171, 123}, {0, 60, 110, 110}},//推荐产品给客户
//            {{560, 950, 430, 200}, {825, 460, 220, 140}, {0, 400, 1080, 200}, {0, 1770, 1080, 250}, {450, 1320, 225, 100}, {570, 730, 440, 200}},//派发红包
//            {{966, 60, 120, 120}, {730, 350, 360, 135}, {0, 1770, 1080, 250}, {0, 1600, 300, 220}, {890, 60, 190, 120}, {785, 45, 171, 130}, {0, 60, 110, 110}, {570, 730, 440, 200}},//邀请理财师
//            {{0, 700, 1080, 350}, {420, 1790, 330, 150}, {585, 900, 690, 910}, {180, 1740, 900, 180}, {380, 1155, 320, 190}},//自己购买
//            {{0, 440, 1080, 200}, {0, 860, 1080, 190}, {0, 0, 140, 150}},//查看收益
//    };
//
//    /**
//     * 手指位置左上角 x,y 坐标 第一个任务取0位置。。。
//     * 三层数组， 表示第几个任务，第几步，手指坐标
//     */
//    public static int[][][] fingerLocationss = {{{860, 80}, {890, 255}, {750, 1370}, {80, 1650}, {712, 60}, {850, 110}, {-10, 40}}, //邀请客户
//            {{760, 880}, {40, 590}, {750, 1700}, {720, 1050}, {580, 1500}, {850, 110}, {0, 80}},//推荐产品给客户
//            {{780, 1000}, {890, 490}, {30, 440}, {750, 1700}, {560, 1360}},//派发红包
//            {{860, 80}, {890, 380}, {750, 1700}, {80, 1650}, {712, 60}, {850, 110}, {-10, 40}}, //邀请理财师
//            {{820, 950}, {680, 1680}, {730, 1000}, {750, 1700}, {580, 1200}},//自己购买
//            {{630, 500}, {300, 950}, {0, 80}},//查看收益
//    };
//
//    /**
//     * 手指旋转的角度 第一个任务取0位置。。。
//     * 两层数组， 表示第几个任务，第几步的手指角度
//     */
//    public static int[][] fingerBitmapRotationAngles = {{30, 0, 0, 330, 60, 0, 330, 0},//
//            {30, 330, -90, -30, 0, 0, 0, 0},//
//            {-30, 0, 0, -90, 0, 0}, //
//            {30, 0, 0, 330, 60, 0, 330, 0},//
//            {0, -90, -30, -90, -30, 0},//自己购买
//            {0, 0, 0, 0, 0}};
//}
