# sundayThink
## 周六洗衣服思考
 周六去洗衣服，引发的一系列思考。具体事项如下
 * 我想去洗衣服，然后用了一个箱子来装衣服
 * 中间去了一个饭店吃饭
 * 吃完饭之后去了洗衣店洗衣服
## 模块拆分
* 我：我是一个实体，我拿了个箱子装衣服。箱子只有一个，这里可以通过单例模式生成一个箱子
* 饭店：饭店也是一个实体，他提供了吃饭的功能
* 洗衣房：洗衣房也是个实体，他提供了洗衣服的功能。他里面有洗衣机和烘干机
    * 洗衣机：洗衣服具体是由洗衣机提供的能力，所以洗衣机是洗衣房的一个属性，但是一个洗衣房不止
    一台洗衣机，所以这里是个List属性
    * 烘干机：烘干机同洗衣机一样。烘干的功能也是由烘干机提供的。而且也是个List属性
    * 单个洗衣机和烘干机的情况：虽然他们都是多台，但是可能存在我去洗衣服的时候洗衣服的时候，可能存在别人在洗
    的情况，所以同一时间只能有一个人在使用。单台情况下，要使用洗衣机的能力，这里肯定得考虑加锁。
 
