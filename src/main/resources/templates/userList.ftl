<#import "parts/common.ftl" as c>

<@c.page>
    <div>List of user!</div>
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Role</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
    <#list users as user>
        <tr>
            <td>${user.username}</td>
            <td><#list user.roles as role>${role}<#sep>, </#list></td>
        </tr>
    </#list>
        </tbody>
    </table>
</@c.page>