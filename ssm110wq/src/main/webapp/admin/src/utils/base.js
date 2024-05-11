const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm110wq/",
            name: "ssm110wq",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm110wq/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "影院选座系统小程序"
        } 
    }
}
export default base
